package Design_Patterns.Behavioral.Strategy.Strategy;

import Design_Patterns.Behavioral.Strategy.Strategy.MathOperationStrategy;

public class MultiplicationOperation implements MathOperationStrategy {
    @Override
    public void performOperation(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}
