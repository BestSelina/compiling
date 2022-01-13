import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class Visitor extends miniSysYBaseVisitor<String> {
    StringBuffer exp = new StringBuffer();
    public String visitCompUnit(miniSysYParser.CompUnitContext ctx){
        visitFuncDef(ctx.funcDef());
        return null;
    }

    public String visitFuncDef(miniSysYParser.FuncDefContext ctx){
        visitFuncType(ctx.funcType());
        visitIdent(ctx.ident());
        System.out.print("(");
        System.out.print(")");
        visitBlock(ctx.block());
        return null;
    }

    public String visitFuncType(miniSysYParser.FuncTypeContext ctx){
        System.out.print("define dso_local i32 ");
        return null;
    }

    public String visitIdent(miniSysYParser.IdentContext ctx){
        System.out.print("@main");
        return null;
    }

    public String visitBlock(miniSysYParser.BlockContext ctx){
        System.out.print("{");
        System.out.print("\n");
        visitStmt(ctx.stmt());
        System.out.println("}");
        return null;
    }

    public String visitStmt(miniSysYParser.StmtContext ctx){
        String expression = exp.append(visitExp(ctx.exp())).toString();
        String[] item = expression.split("[!]+");
        List<String> expList = Arrays.asList(item);
        List<String> postfixExp = parseToSuffixExpression(expList);
        if(postfixExp.size() == 1)
            System.out.println("\tret i32 " + postfixExp.get(0));
        Stack<String> stack = new Stack<>();
        int i = 0;
        for(String s: postfixExp){
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%")) {
                String topStack = stack.pop();
                String secStack = stack.pop();
                i++;
                stack.push("%" + i);
                switch (s){
                    case "+":
                        System.out.println("\t" + "%" + i + " = add i32 " + secStack + ", " + topStack);
                        break;
                    case "-":
                        System.out.println("\t" + "%" + i + " = sub i32 " + secStack + ", " + topStack);
                        break;
                    case "*":
                        System.out.println("\t" + "%" + i + " = mul i32 " + secStack + ", " + topStack);
                        break;
                    case "/":
                        System.out.println("\t" + "%" + i + " = sdiv i32 " + secStack + ", " + topStack);
                        break;
                    case "%":
                        System.out.println("\t" + "%" + i + " = srem i32 " + secStack + ", " + topStack);
                        break;
                    default:
                        break;
                }
            }
            else stack.push(s);
        }
        System.out.println("\tret i32 " + stack.pop());

//        for (String s: expList){
//            System.out.print(s);
//        }
//        System.out.print(exp);
        return null;
    }

    public List<String> parseToSuffixExpression(List<String> expressionList){
        //创建一个栈用于保存操作符
        Stack<String> opStack = new Stack<>();
        //创建一个list用于保存后缀表达式
        List<String> suffixList = new ArrayList<>();
        for(String item : expressionList){
            //得到数或操作符
            if(isOperator(item)){
                //是操作符 判断操作符栈是否为空
                if(opStack.isEmpty() || "(".equals(opStack.peek()) || priority(item) > priority(opStack.peek())){
                    //为空或者栈顶元素为左括号或者当前操作符大于栈顶操作符直接压栈
                    opStack.push(item);
                }else {
                    //否则将栈中元素出栈如队，直到遇到大于当前操作符或者遇到左括号时
                    while (!opStack.isEmpty() && !"(".equals(opStack.peek())){
                        if(priority(item) <= priority(opStack.peek())){
                            suffixList.add(opStack.pop());
                        }
                    }
                    //当前操作符压栈
                    opStack.push(item);
                }
            }else if(isNumber(item)){
                //是数字则直接入队
                suffixList.add(item);
            }else if("(".equals(item)){
                //是左括号，压栈
                opStack.push(item);
            }else if(")".equals(item)){
                //是右括号 ，将栈中元素弹出入队，直到遇到左括号，左括号出栈，但不入队
                while (!opStack.isEmpty()){
                    if("(".equals(opStack.peek())){
                        opStack.pop();
                        break;
                    }else {
                        suffixList.add(opStack.pop());
                    }
                }
            }
        }
        //循环完毕，如果操作符栈中元素不为空，将栈中元素出栈入队
        while (!opStack.isEmpty()){
            if(!opStack.peek().equals("("))
            suffixList.add(opStack.pop());
        }
        return suffixList;
    }

    //判断字符串是否为操作符
    public static boolean isOperator(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%");
    }

    //判断是否为数字
    public static boolean isNumber(String num){
        return num.matches("\\d+");
    }

    //获取操作符的优先级
    public static int priority(String op){
        if(op.equals("*") || op.equals("/") || op.equals("%")){
            return 1;
        }else if(op.equals("+") || op.equals("-")){
            return 0;
        }
        return -1;
    }

    public String visitExp(miniSysYParser.ExpContext ctx){
        return visitAddExp(ctx.addExp());
    }

    public String visitAddExp(miniSysYParser.AddExpContext ctx){
        return visitMulExp(ctx.mulExp()) + visitAddExp0(ctx.addExp0());
    }


    public String visitAddExp0(miniSysYParser.AddExp0Context ctx) {
        if (ctx.addOp() != null)
            return visitAddOp(ctx.addOp()) + visitMulExp(ctx.mulExp()) + visitAddExp0(ctx.addExp0());
        else
            return "";
    }

    public String visitAddOp(miniSysYParser.AddOpContext ctx){
        if(ctx.Add() != null)
            return "!+!";
        else if(ctx.Sub() != null)
            return "!-!";
        else
            return "";
    }

    public String visitMulExp(miniSysYParser.MulExpContext ctx){
        return visitUnaryExp(ctx.unaryExp()) + visitMulExp0(ctx.mulExp0());
    }

    public String visitMulExp0(miniSysYParser.MulExp0Context ctx){
        if(ctx.mulOp() != null){
            return visitMulOp(ctx.mulOp()) + visitUnaryExp(ctx.unaryExp()) + visitMulExp0(ctx.mulExp0());
        }
        else
            return "";
    }

    public String visitMulOp(miniSysYParser.MulOpContext ctx){
        if(ctx.Mul() != null){
            return "!*!";
        }
        else if(ctx.Div() != null){
            return "!/!";
        }
        else if(ctx.Mod() != null)
            return "!%!";
        else
            return "";
    }

    public String visitUnaryExp(miniSysYParser.UnaryExpContext ctx){
        if(ctx.unaryOp() != null){
            if(!visitUnaryOp(ctx.unaryOp()).equals(""))
                return visitUnaryOp(ctx.unaryOp()) + visitUnaryExp(ctx.unaryExp()) + "!)!";
            else
                return visitUnaryOp(ctx.unaryOp()) + visitUnaryExp(ctx.unaryExp());
        }
        else if(ctx.primaryExp() != null){
            return visitPrimaryExp(ctx.primaryExp());
        }
        return "";
    }

    public String visitUnaryOp(miniSysYParser.UnaryOpContext ctx){
        if(ctx.Add() != null)
            return "";
        else if(ctx.Sub() != null)
            return "!(!0!-!";
        else
            return "";
    }

    public String visitPrimaryExp(miniSysYParser.PrimaryExpContext ctx){
        if(ctx.number() != null){
            return visitNumber(ctx.number());
        }
        else if(ctx.LPar() != null){
            return "!(!" + visitExp(ctx.exp()) + "!)!";
        }
        return null;
    }

    public String visitNumber(miniSysYParser.NumberContext ctx) {
        if(ctx.HexadecimalNumber() != null){
            String num = ctx.HexadecimalNumber().toString();
            int number = Integer.parseInt(num.substring(2), 16);
            return String.valueOf(number);
        }
        else if(ctx.OctalNumber() != null) {
            String num = ctx.OctalNumber().toString();
            int number = Integer.parseInt(num, 8);
            return String.valueOf(number);
        }
        else {
            String num = ctx.DecimalNumber().toString();
            int number = Integer.parseInt(num);
            return String.valueOf(number);
        }
    }
}
