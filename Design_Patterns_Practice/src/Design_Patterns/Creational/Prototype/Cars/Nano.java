package Design_Patterns.Creational.Prototype.Cars;

public class Nano extends BasicCar {

    public Nano(double price, String color, String id){
        this.modelName = "Nano";
        this.price += price;
        this.color = color;
        this.id = id;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        BasicCar clone = super.clone();//do clone() in BasicCar
        //can do more if needed. but the class is simple
        return clone;
    }
}
