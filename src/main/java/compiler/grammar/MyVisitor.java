package compiler.grammar;

import parser.grammar.LoopBaseVisitor;
import parser.grammar.LoopParser;

public class MyVisitor extends LoopBaseVisitor<String> {
    @Override
    public String visitPlus(LoopParser.PlusContext ctx) {
        String var = ctx.var.getText();
        int varVal = 0; //get real value in future;
        int num = Integer.parseInt(ctx.num.getText());
        return Integer.valueOf(varVal + num).toString();
    }
}
