package Design_Patterns.Behavioral.Interpreter.Expressions;

import Design_Patterns.Behavioral.Interpreter.Context;
import Design_Patterns.Behavioral.Interpreter.Expressions.Expression;

//non-terminal
public class OrExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public OrExpression(Expression exp1, Expression exp2 ){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(Context context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
