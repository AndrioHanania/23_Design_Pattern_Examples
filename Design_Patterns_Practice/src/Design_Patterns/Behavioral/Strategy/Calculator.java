package Design_Patterns.Behavioral.Strategy;

import Design_Patterns.Behavioral.Strategy.Strategy.MathOperationStrategy;

public class Calculator { //Context
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void setAAndB(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void calculate(MathOperationStrategy strategy){
        strategy.performOperation(a, b);
    }
}
