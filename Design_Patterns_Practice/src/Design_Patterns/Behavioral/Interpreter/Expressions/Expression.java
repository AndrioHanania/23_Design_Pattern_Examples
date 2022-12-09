package Design_Patterns.Behavioral.Interpreter.Expressions;

import Design_Patterns.Behavioral.Interpreter.Context;

public interface Expression {
    public boolean interpret(Context context);
}
