package Design_Patterns.Structural.Decorator.Shapes;


public class LowerCaseShapeDecorator extends ShapeDecorator {
    public LowerCaseShapeDecorator(Shape shape){
        super(shape);
    }

    public String getDraw() {
        return super.getDraw().toLowerCase();
    }
}
