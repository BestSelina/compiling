//visitor.java
public class Visitor extends miniSysYBaseVisitor<Void> {
    int count = 0;
    int flag = 0;
    int number;
    int i=0;
    public Void visitCompUnit(miniSysYParser.CompUnitContext ctx){

        return super.visitCompUnit(ctx);
    }

    public Void visitFuncDef(miniSysYParser.FuncDefContext ctx){
        visit(ctx.funcType());
        visit(ctx.ident());
        System.out.print("(");
        System.out.print(")");
        visit(ctx.block());
        return null;
    }

    public Void visitFuncType(miniSysYParser.FuncTypeContext ctx){
        System.out.print("define dso_local i32 ");
        return null;
    }

    public Void visitIdent(miniSysYParser.IdentContext ctx){
        System.out.print("@main");
        return null;
    }

    public Void visitBlock(miniSysYParser.BlockContext ctx){
        System.out.print("{");
        System.out.print("\n");
        visit(ctx.stmt());
        System.out.print("\n");
        System.out.println("}");
        return null;
    }

    public Void visitStmt(miniSysYParser.StmtContext ctx){
        System.out.print("\t");
        visit(ctx.exp());
        if(flag == 1){
            System.out.print("%1" + " = " + "sub i32 0, " + number);
            for(i = 2; i <=count; i++) {
                int j = i-1;
                System.out.print("\n\t");
                System.out.print("%" + i + " = " + "sub i32 0, " + "%" + j);
            }
        }
        System.out.print("\n\t");
        System.out.print("ret i32 ");
        System.out.print("%" + count);
        return null;
    }

    public Void visitExp(miniSysYParser.ExpContext ctx){
        visit(ctx.addExp());
        return null;
    }

    public Void visitAddExp(miniSysYParser.AddExpContext ctx){
        visit(ctx.mulExp());
        return null;
    }

    public Void visitMulExp(miniSysYParser.MulExpContext ctx){
        visit(ctx.unaryExp());
        return null;
    }

    public Void visitUnaryExp(miniSysYParser.UnaryExpContext ctx){
        if(ctx.UnaryOp() != null){
            String op = ctx.UnaryOp().toString();
            if(op.equals("-")) {
                count++;
            }
//            if(flag == 1){
//                System.out.print("%1" + " = " + "sub i32 0, " + number);
//                for(i = 2; i <=count; i++) {
//                    int j = i-1;
//                    System.out.print("%" + i + " = " + "sub i32 0, " + "%" + j);
//                }
//            }
            visit(ctx.unaryExp());
        }
        else if(ctx.primaryExp() != null){
            visit(ctx.primaryExp());
        }
        return null;
    }

    public Void visitPrimaryExp(miniSysYParser.PrimaryExpContext ctx){
        if(ctx.number() != null){
            flag = 1;
            visit(ctx.number());
        }
        else if(ctx.LPar() != null){
            visit(ctx.exp());
        }
        return null;
    }

    public Void visitNumber(miniSysYParser.NumberContext ctx) {
        if(ctx.HexadecimalNumber() != null){
            String num = ctx.HexadecimalNumber().toString();
            number = Integer.parseInt(num.substring(2), 16);
        }
        else if(ctx.OctalNumber() != null) {
            String num = ctx.OctalNumber().toString();
            number = Integer.parseInt(num, 8);
        }
        else {
            String num = ctx.DecimalNumber().toString();
            number = Integer.parseInt(num);
        }
        return null;
    }
}
