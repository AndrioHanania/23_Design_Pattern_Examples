package Design_Patterns.Structural.Facade;

import Design_Patterns.Structural.Facade.Hotels.BothTypeRestaurant;
import Design_Patterns.Structural.Facade.Hotels.NonVegRestaurant;
import Design_Patterns.Structural.Facade.Hotels.VegRestaurant;
import Design_Patterns.Structural.Facade.Menus.Menu;

public class HotelKeeper {//Design_Patterns.Structural.Facade
    public Menu getVegMenu(){
        VegRestaurant restaurant = new VegRestaurant();
        return restaurant.getMenu();
    }
    public Menu getNonVegMenu(){
        NonVegRestaurant restaurant = new NonVegRestaurant();
        return restaurant.getMenu();
    }
    public Menu getBothTypeMenu(){
        BothTypeRestaurant restaurant = new BothTypeRestaurant();
        return restaurant.getMenu();
    }
}
