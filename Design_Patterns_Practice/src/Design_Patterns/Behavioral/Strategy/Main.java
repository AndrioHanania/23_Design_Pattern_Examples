package Design_Patterns.Behavioral.Strategy;

import Design_Patterns.Behavioral.Strategy.Strategy.AddOperation;
import Design_Patterns.Behavioral.Strategy.Strategy.MultiplicationOperation;
import Design_Patterns.Behavioral.Strategy.Strategy.SubtractionOperation;

//An application that perform mathematical operations for 2 numbers.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(3, 4);
        calculator.calculate(new AddOperation());
        calculator.setAAndB(5, 5);
        calculator.calculate(new SubtractionOperation());
        calculator.setAAndB(-2, 3);
        calculator.calculate(new MultiplicationOperation());
    }
}
