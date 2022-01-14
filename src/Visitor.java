
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;
import java.util.List;


public class Visitor extends miniSysYBaseVisitor<String> {

    HashMap<String, String> constList = new HashMap<>();
    HashMap<String, String> valList = new HashMap<>();

    int i = 1;

    public String visitCompUnit(miniSysYParser.CompUnitContext ctx){
        visitFuncDef(ctx.funcDef());
        return null;
    }

    public String visitFuncDef(miniSysYParser.FuncDefContext ctx){
        visitFuncType(ctx.funcType());
        visitIdent(ctx.ident());
        System.out.print("(");
        System.out.print(")");
        System.out.print(" {\n");
        visitBlock(ctx.block());
        System.out.print("}");
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
        for (int j = 0; j < ctx.blockItem().size(); j++)
            visitBlockItem(ctx.blockItem(j));
        return "";
    }

    public String visitBlockItem(miniSysYParser.BlockItemContext ctx){
        if(ctx.decl() != null){
            return visitDecl(ctx.decl());
        }
        else if(ctx.stmt() != null){
            return visitStmt(ctx.stmt());
        }
        else
            return "";
    }

    public String visitDecl(miniSysYParser.DeclContext ctx){
        if(ctx.constDecl() != null){
            return visitConstDecl(ctx.constDecl());
        }
        else{
            return visitVarDecl(ctx.varDecl());
        }
    }

    public String visitConstDecl(miniSysYParser.ConstDeclContext ctx){
        for (int j = 0; j < ctx.constDef().size(); j++)
            visitConstDef(ctx.constDef(j));
        return "";
    }

    public String visitConstDef(miniSysYParser.ConstDefContext ctx){
        if (constList.containsKey(ctx.Ident().toString()))
            System.exit(2);
        constList.put(ctx.Ident().toString(), visitConstInitVal(ctx.constInitVal()));
        return "";
    }

    public String visitConstInitVal(miniSysYParser.ConstInitValContext ctx){
        return visitConstExp(ctx.constExp());
    }

    public String visitConstExp(miniSysYParser.ConstExpContext ctx){
        String expression = visitAddExp(ctx.addExp());
        String[] item = expression.split("[$]+");
        List<String> expList = Arrays.asList(item);
        List<String> postfixExp = parseToSuffixExpression(expList);
        Stack<String> stack = new Stack<>();
        for(String s: postfixExp){
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%")) {
                String topStack = stack.pop();
                String secStack = stack.pop();
                switch (s){
                    case "+":
                        stack.push(String.valueOf(Integer.parseInt(topStack) + Integer.parseInt(secStack)));
                        break;
                    case "-":
                        stack.push(String.valueOf(Integer.parseInt(secStack) - Integer.parseInt(topStack)));
                        break;
                    case "*":
                        stack.push(String.valueOf(Integer.parseInt(secStack) * Integer.parseInt(topStack)));
                        break;
                    case "/":
                        stack.push(String.valueOf(Integer.parseInt(secStack) / Integer.parseInt(topStack)));
                        break;
                    case "%":
                        stack.push(String.valueOf(Integer.parseInt(secStack) % Integer.parseInt(topStack)));
                        break;
                    default:
                        break;
                }
            }
            else {
                if(constList.containsKey(s))
                    stack.push(constList.get(s));
                else if(isNumber(s))
                    stack.push(s);
                else
                    System.exit(2);
            }
        }
        return stack.peek();
    }

    public String visitVarDecl(miniSysYParser.VarDeclContext ctx){
        int j;
        for(j = 0; j < ctx.varDef().size(); j++){
            visitVarDef(ctx.varDef(j));
        }
        return "";
    }

    public String visitVarDef(miniSysYParser.VarDefContext ctx) {
        if (valList.containsKey(ctx.Ident().toString()))
            System.exit(2);
        valList.put(ctx.Ident().toString(), "%x" + i);
        System.out.println("\t%x" + i + " = alloca i32");
        i++;
        if (ctx.Assign() == null)
            return "";
        else {
            String value = visitInitVal(ctx.initVal());
            System.out.println("\tstore i32 " + value + ", i32* " + valList.get(ctx.Ident().toString()));
            return "";
        }
    }

    public String visitInitVal(miniSysYParser.InitValContext ctx){
        String expression = visitExp(ctx.exp());
        String[] item = expression.split("[$]+");
        List<String> expList = Arrays.asList(item);
        List<String> postfixExp = parseToSuffixExpression(expList);
        if(postfixExp.size() == 1 && isNumber(postfixExp.get(0)))
            return postfixExp.get(0);
        Stack<String> stack = new Stack<>();
        for(String s: postfixExp) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%")) {
                String topStack = stack.pop();
                String secStack = stack.pop();
                stack.push("%x" + i);
                switch (s) {
                    case "+":
                        System.out.println("\t%x" + i + " = add i32 " + secStack + ", " + topStack);
                        i++;
                        break;
                    case "-":
                        System.out.println("\t%x" + i + " = sub i32 " + secStack + ", " + topStack);
                        i++;
                        break;
                    case "*":
                        System.out.println("\t%x" + i + " = mul i32 " + secStack + ", " + topStack);
                        i++;
                        break;
                    case "/":
                        System.out.println("\t%x" + i + " = sdiv i32 " + secStack + ", " + topStack);
                        i++;
                        break;
                    case "%":
                        System.out.println("\t%x" + i + " = srem i32 " + secStack + ", " + topStack);
                        i++;
                        break;
                    default:
                        break;
                }
            } else {
                if (constList.containsKey(s))
                    stack.push(constList.get(s));
                else if (valList.containsKey(s)) {
                    System.out.println("\t%x" + i + " = load i32, i32* " + valList.get(s));
                    stack.push("%x" + i);
                    i++;
                }
                else if (isNumber(s))
                    stack.push(s);
                else {
                    if (Function.checkFuncIdent(s) == 0) {
                        System.out.println("\t%x" + i + " = " + "call i32 @" + s + "()");
                        stack.push("%x" + i);
                        i++;
                    }else if(Function.checkFuncIdent(s) == 1) {
                        System.out.println("\tcall void @" + s + "(i32 " + "%x" + i);
                        stack.push("%x" + i);
                        i++;
                    }
                    else
                        System.exit(2);
                }
            }
        }
        return stack.peek();
    }

    public String visitStmt(miniSysYParser.StmtContext ctx){
        if(visitLVal(ctx.lVal()) != null && ctx.Assign() != null){
            if(!valList.containsKey(visitLVal(ctx.lVal())))
                System.exit(2);
            else {
                String exp = visitExp(ctx.exp());
                System.out.println("\tstore i32 " + calculateVal(exp) + ", i32* " + valList.get(visitLVal(ctx.lVal())));
                return "";
            }
        }
        else if(ctx.Return() != null) {
            String exp = visitExp(ctx.exp());
            System.out.println("\tret i32 " + calculateVal(exp));
        }
        else if(ctx.exp() != null) {
            calculateVal(visitExp(ctx.exp()));
        }
        else if(ctx.block() != null)
            visitBlock(ctx.block());
        else if(ctx.children.size() == 5) {
            int ifStmt = i;
            i++;
            int then = i;
            i++;
            String res = visitCond(ctx.cond());
            System.out.println("\t%x" + i + " = icmp ne i32 " + res + ", 0");
            System.out.println("\tbr i1 %x" + i + ", label %x" + ifStmt + ", label %x" + then);
            i++;
            System.out.println("x" + ifStmt + ":");
            visitStmt(ctx.stmt(0));
            System.out.println("\tbr label %x" + then);
            System.out.println("x" + then + ":");

        }
        else if(ctx.children.size() == 7){
            int ifStmt = i;
            i++;
            int elseStmt = i;
            i++;
            int then = i;
            i++;
            String res = visitCond(ctx.cond());
            System.out.println("\t%x" + i + " = icmp ne i32 " + res + ", 0");
            System.out.println("\tbr i1 %x" + i + ", label %x" + ifStmt + ", label %x" + elseStmt);
            i++;
            System.out.println("x" + ifStmt + ":");
            visitStmt(ctx.stmt(0));
            System.out.println("\tbr label %x" + then);
            System.out.println("x" + elseStmt + ":");
            visitStmt(ctx.stmt(1));
            System.out.println("\tbr label %x" + then);
            System.out.println("x" + then + ":");
        }
        return "";
    }

    public String visitCond(miniSysYParser.CondContext ctx){
        return calculateVal(visitLOrExp(ctx.lOrExp()));
    }

    public String visitLOrExp(miniSysYParser.LOrExpContext ctx){
        return visitLAndExp(ctx.lAndExp()) + visitLOrExp0(ctx.lOrExp0());
    }

    public String visitLOrExp0(miniSysYParser.LOrExp0Context ctx){
        if(ctx.lOrOp() != null)
            return "$||$" + visitLAndExp(ctx.lAndExp()) + visitLOrExp0(ctx.lOrExp0());
        else
            return "";
    }


    public String visitLAndExp(miniSysYParser.LAndExpContext ctx){
        return visitEqExp(ctx.eqExp()) + visitLAndExp0(ctx.lAndExp0());
    }

    public String visitLAndExp0(miniSysYParser.LAndExp0Context ctx){
        if(ctx.lAndOp() != null)
        return "$&&$" + visitEqExp(ctx.eqExp()) + visitLAndExp0(ctx.lAndExp0());
        return "";
    }

    public String visitEqExp(miniSysYParser.EqExpContext ctx){
        return visitRelExp(ctx.relExp()) + visitEqExp0(ctx.eqExp0());
    }

    public String visitEqExp0(miniSysYParser.EqExp0Context ctx){
        if(ctx.eqOp() != null)
        return visitEqOp(ctx.eqOp()) + visitRelExp(ctx.relExp()) + visitEqExp0(ctx.eqExp0());
        return "";
    }

    public String visitEqOp(miniSysYParser.EqOpContext ctx){
        if(ctx.Eq() != null)
            return "$==$";
        else
            return "$!=$";
    }

    public String visitRelExp(miniSysYParser.RelExpContext ctx){
        return "$($" + visitAddExp(ctx.addExp()) + visitRelExp0(ctx.relExp0()) + "$)$";
    }

    public String visitRelExp0(miniSysYParser.RelExp0Context ctx){
        if(ctx.relOp() != null)
        return visitRelOp(ctx.relOp()) + visitAddExp(ctx.addExp()) + visitRelExp0(ctx.relExp0());
        return "";
    }

    public String visitRelOp(miniSysYParser.RelOpContext ctx){
        if(ctx.Lt() != null)
            return "$<$";
        else if(ctx.Gt() != null)
            return "$>$";
        else if(ctx.LtEq() != null)
            return "$<=$";
        else if(ctx.GtEq() != null)
            return "$>=$";
        return "";
    }

    public String visitExp(miniSysYParser.ExpContext ctx) {
        if (ctx != null) {
            return visitAddExp(ctx.addExp());
        }
        else
            return "";
    }

    public String visitLVal(miniSysYParser.LValContext ctx){
        if (ctx != null)
        return ctx.Ident().toString();
        return "";
    }

    public String visitAddExp(miniSysYParser.AddExpContext ctx){
        return visitMulExp(ctx.mulExp()) + visitAddExp0(ctx.addExp0());
    }

    public String calculateVal(String expression){
        String[] item = expression.split("[$]+");
        List<String> expList = Arrays.asList(item);
        List<String> postfixExp = parseToSuffixExpression(expList);
        Stack<String> stack = new Stack<>();
        for (String s : postfixExp) {
            if (isOperator(s)) {
                String topStack = stack.pop();
                String secStack = stack.pop();
                stack.push("%x" + i);
                switch (s) {
                    case "+":
                        System.out.println("\t%x" + i + " = add i32 " + secStack + ", " + topStack);
                        break;
                    case "-":
                        System.out.println("\t%x" + i + " = sub i32 " + secStack + ", " + topStack);
                        break;
                    case "*":
                        System.out.println("\t%x" + i + " = mul i32 " + secStack + ", " + topStack);
                        break;
                    case "/":
                        System.out.println("\t%x" + i + " = sdiv i32 " + secStack + ", " + topStack);
                        break;
                    case "%":
                        System.out.println("\t%x" + i + " = srem i32 " + secStack + ", " + topStack);
                        break;
                    case "<":
                        System.out.println("\t%x" + i + " = icmp slt i32 " + secStack + ", " + topStack);
                        break;
                    case ">":
                        System.out.println("\t%x" + i + " = icmp sgt i32" + secStack + ", " + topStack);
                        break;
                    case "<=":
                        System.out.println("\t%x" + i + " = icmp sle i32 " + secStack + ", " + topStack);
                        break;
                    case ">=":
                        System.out.println("\t%x" + i + " = icmp sge i32 " + secStack + ", " + topStack);
                        break;
                    case "==":
                        System.out.println("\t%x" + i + " = icmp eq i32 " + secStack + ", " + topStack);
                        break;
                    case "||":
                        System.out.println("\t%x" + i + " = or i32 " + secStack + ", " + topStack);
                        break;
                    case "&&":
                        System.out.println("\t%x" + i + " = and i32 " + secStack + ", " + topStack);
                        break;
                    default:
                        break;
                    }
                    if((s.equals("<") || s.equals(">") || s.equals("<=") || s.equals(">=") || s.equals("==")) ) {
                        int k = i;
                        i++;
                        System.out.println("\t%x" + i + " = zext i1 %x" + k + " to i32");
                    }
                    i++;
            } else {
                if (constList.containsKey(s))
                    stack.push(constList.get(s));
                else if (valList.containsKey(s)) {
                    System.out.println("\t%x" + i + " = load i32, i32* " + valList.get(s));
                    stack.push("%x" + i);
                    i++;
                } else if (isNumber(s))
                    stack.push(s);
                else if (Function.checkFuncIdent(s) == 0) {
                    System.out.println("\t%x" + i + " = call i32 @" + s + "()");
                    stack.push("%x" + i);
                    i++;
                } else if (Function.checkFuncIdent(s) == 1) {
                    System.out.println("\tcall void @" + s + "(i32 " + "%x" + i + ")");
                    stack.push("%x" + i);
                    i++;
                } else
                    System.exit(2);
            }
        }
        if(stack.empty())
            return "";
        else
            return stack.peek();
    }

    public List<String>  parseToSuffixExpression(List<String> expressionList){
        Stack<String> opStack = new Stack<>();
        List<String> suffixList = new ArrayList<>();
        for(String item : expressionList){
            if(isOperator(item)){
                if(opStack.isEmpty() || "(".equals(opStack.peek()) || priority(item) > priority(opStack.peek())){
                    opStack.push(item);
                }else {
                    while (!opStack.isEmpty() && !"(".equals(opStack.peek())){
                        if(priority(item) <= priority(opStack.peek())){
                            suffixList.add(opStack.pop());
                        }
                    }
                    opStack.push(item);
                }
            }else if(isNumber(item)){
                suffixList.add(item);
            }else if(valList.containsKey(item)){
                suffixList.add(item);
            }else if(constList.containsKey(item)){
                suffixList.add(item);
            } else if(Function.checkFuncIdent(item) == 0 || Function.checkFuncIdent(item) == 1 ){
                suffixList.add(item);
            } else if("(".equals(item)){
                opStack.push(item);
            }else if(")".equals(item)){
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
        while (!opStack.isEmpty()){
            if(!opStack.peek().equals("("))
            suffixList.add(opStack.pop());
        }
        return suffixList;
    }


    public static boolean isOperator(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%") || op.equals("<") || op.equals(">") || op.equals("<=") || op.equals(">=") || op.equals("==") || op.equals("!=") || op.equals("&&") || op.equals("||");
    }

    public static boolean isNumber(String num){
        return num.matches("\\d+");
    }

    public static int priority(String op){
        switch (op) {
            case "*":
            case "/":
            case "%":
                return 5;
            case "+":
            case "-":
                return 4;
            case "<":
            case ">":
            case "<=":
            case ">=":
                return 3;
            case "==":
            case "!=":
                return 2;
            case "&&":
                return 1;
            case "||":
                return 0;
        }
        return -1;
    }

    public String visitAddExp0(miniSysYParser.AddExp0Context ctx) {
        if (ctx.addOp() != null)
            return visitAddOp(ctx.addOp()) + visitMulExp(ctx.mulExp()) + visitAddExp0(ctx.addExp0());
        else
            return "";
    }

    public String visitAddOp(miniSysYParser.AddOpContext ctx){
        if(ctx.Add() != null)
            return "$+$";
        else if(ctx.Sub() != null)
            return "$-$";
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
            return "$*$";
        }
        else if(ctx.Div() != null){
            return "$/$";
        }
        else if(ctx.Mod() != null)
            return "$%$";
        else
            return "";
    }

    public String visitUnaryExp(miniSysYParser.UnaryExpContext ctx){
        if(ctx.unaryOp() != null){
            if(!visitUnaryOp(ctx.unaryOp()).equals(""))
                return visitUnaryOp(ctx.unaryOp()) + visitUnaryExp(ctx.unaryExp()) + "$)$";
            else
                return visitUnaryOp(ctx.unaryOp()) + visitUnaryExp(ctx.unaryExp());
        }
        else if(ctx.primaryExp() != null){
            return visitPrimaryExp(ctx.primaryExp());
        }
        else if(ctx.Ident() != null && ctx.funcRParams() == null){
            if(Function.checkFuncIdent(ctx.Ident().toString()) == 0 || Function.checkFuncIdent(ctx.Ident().toString()) == 1)
                return (ctx.Ident()).toString() + "$($" + "$)$";
            else
                System.exit(2);
        }
        else if(ctx.Ident() != null && ctx.funcRParams() != null){
            if(Function.checkFuncIdent(ctx.Ident().toString()) == 0 || Function.checkFuncIdent(ctx.Ident().toString()) == 1) {
                System.out.println("\tcall void @" + ctx.Ident().toString() + "(i32 " + visitFuncRParams(ctx.funcRParams()) + ")");
            }
            else
                System.exit(2);
        }
        return "";
    }

    public String visitFuncRParams(miniSysYParser.FuncRParamsContext ctx){
        String exp = visitExp(ctx.exp());
        return calculateVal(exp);
    }


    public String visitUnaryOp(miniSysYParser.UnaryOpContext ctx){
        if(ctx.Add() != null)
            return "";
        else if(ctx.Sub() != null)
            return "$($0$-$";
        else
            return "";
    }

    public String visitPrimaryExp(miniSysYParser.PrimaryExpContext ctx){
        if(ctx.number() != null){
            return visitNumber(ctx.number());
        }
        else if(ctx.LPar() != null){
            return "$($" + visitExp(ctx.exp()) + "$)$";
        }
        else if(ctx.lVal() != null)
            return visitLVal(ctx.lVal());
        return "";
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
