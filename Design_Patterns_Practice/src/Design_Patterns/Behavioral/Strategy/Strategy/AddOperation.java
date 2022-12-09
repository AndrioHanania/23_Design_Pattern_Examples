package Design_Patterns.Behavioral.Strategy.Strategy;

public class AddOperation implements MathOperationStrategy {
    @Override
    public void performOperation(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
