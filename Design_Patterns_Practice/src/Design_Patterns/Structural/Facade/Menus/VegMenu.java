package Design_Patterns.Structural.Facade.Menus;

public class VegMenu  implements Menu {

    public VegMenu() {System.out.println("Creating a veg menu");}

    @Override
    public void show() {
        System.out.println("Menu items in veg menu");
    }
}