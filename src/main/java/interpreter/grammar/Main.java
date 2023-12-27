package interpreter.grammar;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.grammar.LoopLexer;
import parser.grammar.LoopParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Bitte geben Sie als erstes Argument den Dateipfad des Programms an.\nAlle weiteren Argumente werden als Startparameter in x1, x2, .. übernommen.");
            return;
        }
        VariableSingleton vars = VariableSingleton.getInstance();
        for (int i = 1; i < args.length; i++) {
            try {
                int value = Integer.parseInt(args[i]);
                vars.setX(i, value);
                System.out.println("x"+i+" = " + value);
            } catch (NumberFormatException e) {
                System.out.println("Argument " + i + " ist kein gültiger Integer: " + args[i]);
                return;
            }
        }

        ANTLRInputStream input;
        try {
            input = new ANTLRFileStream(args[0]);
        } catch (IOException e) {
            System.out.println("Ungültiger Dateipfad D:");
            return;
        }
        LoopLexer lexer = new LoopLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LoopParser parser = new LoopParser(tokens);

        ParseTree tree = parser.start();
        new Visitor().visit(tree);
    }
}
