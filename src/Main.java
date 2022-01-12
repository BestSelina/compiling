// Main.java
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        while (scanner.hasNextLine()) {
            String next = scanner.nextLine();
            if(next.equals("")) break;
            str.append(next).append('\n');
        }
        CharStream inputStream = CharStreams.fromString(str.toString());

        miniSysY_v1Lexer lexer = new miniSysY_v1Lexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ErrorHandler());

        CommonTokenStream tokenStream = new CommonTokenStream(lexer); // 词法分析获取 token 流
        miniSysY_v1Parser parser = new miniSysY_v1Parser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorHandler());

        ParseTree tree = parser.compUnit(); // 获取语法树的根节点
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }
}