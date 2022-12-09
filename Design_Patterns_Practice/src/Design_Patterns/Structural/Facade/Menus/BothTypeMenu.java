package Design_Patterns.Structural.Facade.Menus;

public class BothTypeMenu implements Menu {

    public BothTypeMenu()
    {
        System.out.println("Creating both a veg and non veg menu");
    }
    public void show() {
        System.out.println("Menu items in both a veg and non veg menu");
    }
}
