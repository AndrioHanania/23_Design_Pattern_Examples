package Design_Patterns.Structural.Bridge;

import Design_Patterns.Structural.Bridge.Colors.GreenColor;
import Design_Patterns.Structural.Bridge.Colors.RedColor;

//The diagram found in the summary in this chapter seems too
//complicated.
//With the help of this pattern, you can separate the shapes from
//the colors and make things more comfortable.
public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Triangle(new GreenColor());
        shape1.drawShapes(20);
        shape1.modifyBorder(60);

        Shape shape2 = new Rectangle(new RedColor());
        shape2.drawShapes(10);
        shape2.modifyBorder(50);
    }
}
