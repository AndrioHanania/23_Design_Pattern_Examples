package Design_Patterns.Structural.Bridge;

import Design_Patterns.Structural.Bridge.Colors.Color;

public class Rectangle extends Shape {
    protected Rectangle(Color color) {
        super(color);
    }
    @Override
    public void drawShapes(int border) {
        System.out.print("This is Rectangle colored: ");
        color.fillWithColor(border);
    }
    @Override
    public void modifyBorder(int border) {
        System.out.println("Changing the border: ");
        drawShapes(border);
    }
}
