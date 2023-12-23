package interpreter.grammar;

import parser.grammar.LoopBaseVisitor;
import parser.grammar.LoopParser;

public class MyVisitor extends LoopBaseVisitor<Integer> {

    @Override
    public Integer visitStart(LoopParser.StartContext ctx) {
        visitChildren(ctx);
        System.out.println("\nFinal value of x0 = " + VariableSingleton.getInstance().getValue("x0"));
        return null;
    }
    @Override
    public Integer visitPlus(LoopParser.PlusContext ctx) {
        int varVal = VariableSingleton.getInstance().getValue(ctx.var.getText());
        int num = Integer.parseInt(ctx.num.getText());
        return varVal + num;
    }

    @Override
    public Integer visitMinus(LoopParser.MinusContext ctx) {
        int varVal = VariableSingleton.getInstance().getValue(ctx.var.getText());
        int num = Integer.parseInt(ctx.num.getText());
        return varVal - num;
    }

    @Override
    public Integer visitEx(LoopParser.ExContext ctx) {
        int value = visit(ctx.ex);
        VariableSingleton.getInstance().setValue(ctx.var.getText(), value);
        return value;
    }

    @Override
    public Integer visitVa(LoopParser.VaContext ctx) {
        VariableSingleton vars = VariableSingleton.getInstance();
        int value = vars.getValue(ctx.varFrom.getText());
        vars.setValue(ctx.varTo.getText(), value);
        return value;
    }

    @Override
    public Integer visitNum(LoopParser.NumContext ctx) {
        int number = Integer.parseInt(ctx.num.getText());
        VariableSingleton.getInstance().setValue(ctx.var.getText(), number);
        return number;
    }

    @Override
    public Integer visitLoop(LoopParser.LoopContext ctx) {
        int loopVar = VariableSingleton.getInstance().getValue(ctx.var.getText());
        for (int i = 0; i < loopVar; i++) {
            visit(ctx.p);
        }

        return null;
    }
}
