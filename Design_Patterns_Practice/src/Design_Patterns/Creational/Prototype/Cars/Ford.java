package Design_Patterns.Creational.Prototype.Cars;

public class Ford extends BasicCar {

    public Ford(double price, String color, String id){
        this.modelName = "Ford";
        this.price += price;
        this.color = color;
        this.id = id;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        BasicCar clone = super.clone();//do clone() in BasicCar
        //can do more if needed. but the class is simple
        return clone;
    }
}
