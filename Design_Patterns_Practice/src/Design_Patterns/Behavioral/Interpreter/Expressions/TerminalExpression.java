package Design_Patterns.Behavioral.Interpreter.Expressions;

import Design_Patterns.Behavioral.Interpreter.Context;
import Design_Patterns.Behavioral.Interpreter.Expressions.Expression;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(Context context) {
        return context.getResult(data);
    }
}
