//visitor.java
public class Visitor extends miniSysY_v1BaseVisitor<Void> {
    public Void visitCompUnit(miniSysY_v1Parser.CompUnitContext ctx){

        return super.visitCompUnit(ctx);
    }

    public Void visitFuncDef(miniSysY_v1Parser.FuncDefContext ctx){
        visit(ctx.funcType());
        visit(ctx.ident());
        System.out.print("(");
        System.out.print(")");
        visit(ctx.block());
        return null;
    }

    public Void visitFuncType(miniSysY_v1Parser.FuncTypeContext ctx){
        System.out.print("define dso_local i32 ");
        return null;
    }

    public Void visitIdent(miniSysY_v1Parser.IdentContext ctx){
        System.out.print("@main");
        return null;
    }

    public Void visitBlock(miniSysY_v1Parser.BlockContext ctx){
        System.out.print("{");
        System.out.print("\n");
        visit(ctx.stmt());
        System.out.print("\n");
        System.out.println("}");
        return null;
    }

    public Void visitStmt(miniSysY_v1Parser.StmtContext ctx){
        System.out.print("\t");
        System.out.print("ret i32 ");
        visit(ctx.number());
        System.out.print(";");
        return null;
    }

    public Void visitNumber(miniSysY_v1Parser.NumberContext ctx) {
        if(ctx.HexadecimalNumber() != null){
            String num = ctx.HexadecimalNumber().toString();
            System.out.print(Integer.parseInt(num.substring(2), 16));
        }
        else if(ctx.OctalNumber() != null) {
            String num = ctx.OctalNumber().toString();
            System.out.print(Integer.parseInt(num, 8));
        }
        else {
            String num = ctx.DecimalNumber().toString();
            System.out.print(Integer.parseInt(num));
        }
        return null;
    }
}
