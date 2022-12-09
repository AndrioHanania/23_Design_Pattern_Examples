package Design_Patterns.Structural.Decorator;

import Design_Patterns.Structural.Decorator.Shapes.Circle;
import Design_Patterns.Structural.Decorator.Shapes.LowerCaseShapeDecorator;
import Design_Patterns.Structural.Decorator.Shapes.Shape;
import Design_Patterns.Structural.Decorator.Shapes.ShapeDecorator;

//We use this pattern to add new functionality to application
//that draw various shapes.
public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        System.out.println(circle1.getDraw());

        System.out.println("\ncircle with lower case draw:");
        ShapeDecorator decorator = new LowerCaseShapeDecorator(circle1);
        System.out.println(decorator.getDraw());

        System.out.println("\ncreate new circle:");
        Shape circle2 = new Circle();
        System.out.println(circle2.getDraw());
    }
}
