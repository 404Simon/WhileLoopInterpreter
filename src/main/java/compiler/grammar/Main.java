package compiler.grammar;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.grammar.LoopLexer;
import parser.grammar.LoopParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("src/main/java/compiler/grammar/test.txt");
        LoopLexer lexer = new LoopLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LoopParser parser = new LoopParser(tokens);

        ParseTree tree = parser.start();
        new MyVisitor().visit(tree);
    }
}
