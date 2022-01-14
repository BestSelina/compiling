public class Function {

    public static int checkFuncIdent (String s) {
        if (s.equals("getint") || s.equals("getch"))
            return 0;
        else if (s.equals("putint") || s.equals("putch"))
            return 1;
        return -1;
    }

    public static void declareFunc (String s) {
        if (s.contains("getint"))
            System.out.println("declare i32 @getint()");
        if (s.contains("getch"))
            System.out.println("declare i32 @getch()");
        if (s.contains("putint"))
            System.out.println("declare void @putint(i32)");
        if (s.contains("putch"))
            System.out.println("declare void @putch(i32)");
    }
}
