package Design_Patterns.Creational.Prototype;

import Design_Patterns.Creational.Prototype.Cars.BasicCar;
import Design_Patterns.Creational.Prototype.Cars.Ford;
import Design_Patterns.Creational.Prototype.Cars.Nano;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> map = new Hashtable<>();

    public static void loadCache(){
        BasicCar car1 = new Ford(100, "Yellow", "1");
        BasicCar car2 = new Nano(200, "Green", "2");
        map.put("1", car1);
        map.put("2", car2);
    }

    public static BasicCar getCar(String id) throws CloneNotSupportedException {
        BasicCar car = map.get(id);
        return car.clone();
    }
}
