package Design_Patterns.Behavioral.Interpreter;

import Design_Patterns.Behavioral.Interpreter.Expressions.AndExpression;
import Design_Patterns.Behavioral.Interpreter.Expressions.Expression;
import Design_Patterns.Behavioral.Interpreter.Expressions.OrExpression;
import Design_Patterns.Behavioral.Interpreter.Expressions.TerminalExpression;

//Interpret And/Or expression into boolean.
public class Main {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static Expression getHappyPeopleExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        Expression john = new TerminalExpression("John");
        return new OrExpression(julie, new OrExpression(married, john));
    }

    public static void main (String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        Expression isHappyPeople = getHappyPeopleExpression();

        Context c1 = new Context("John");
        Context c2 = new Context("Married Julie");
        Context c3 = new Context("Lucy");
        Context c4 = new Context("Robert");

        System.out.println("John is male? " + isMale.interpret(c1));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret(c2));
        System.out.println("Lucy is male? " + isMale.interpret(c3));
        System.out.println("John is happy? " + isHappyPeople.interpret(c1));
        System.out.println("Robert is happy? " + isHappyPeople.interpret(c4));
    }
}
