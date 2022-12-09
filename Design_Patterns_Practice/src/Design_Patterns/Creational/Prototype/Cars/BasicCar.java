package Design_Patterns.Creational.Prototype.Cars;

public abstract class BasicCar implements Cloneable {
    protected String modelName;
    protected double price = 50;
    protected String color;
    protected String id;

    public BasicCar clone() throws CloneNotSupportedException{
        BasicCar clone = null;
        try{
            clone = (BasicCar)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

    public void print(){
        System.out.println("car:: model: " + modelName +
                ", price: " + price +
                ", color: " + color +
                ", id: " + id);
    }
}
