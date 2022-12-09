package Design_Patterns.Structural.Facade.Menus;

public class NonVegMenu  implements Menu {

    public NonVegMenu()
    {
        System.out.println("Creating a non veg menu");
    }
    @Override
    public void show() {
        System.out.println("Menu items in non veg menu");
    }
}