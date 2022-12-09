package Design_Patterns.Structural.Bridge;

import Design_Patterns.Structural.Bridge.Colors.Color;

public abstract class Shape {
    public abstract void drawShapes(int border);
    public abstract void modifyBorder(int border);
    protected Color color;
    protected Shape(Color color)
    {this.color = color;}
}
