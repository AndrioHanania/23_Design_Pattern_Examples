package Design_Patterns.Creational.Prototype;

import Design_Patterns.Creational.Prototype.Cars.BasicCar;

//We want to return duplicate cars (clones) from cache.
public class Main {
    public static void main(String[] args) {
        BasicCarCache.loadCache();
        BasicCar car1 = null;
        BasicCar car2 = null;
        try {
            car1 = BasicCarCache.getCar("1");
            car2 = BasicCarCache.getCar("2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        car1.print();
        car2.print();
    }
}
