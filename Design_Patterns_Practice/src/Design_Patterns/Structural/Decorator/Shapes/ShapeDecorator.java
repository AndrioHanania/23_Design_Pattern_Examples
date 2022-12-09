package Design_Patterns.Structural.Decorator.Shapes;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;
    public ShapeDecorator(Shape shape){this.shape = shape;}
    public String getDraw() {
        if(shape != null)
            return shape.getDraw();
        return "";
    }
}
