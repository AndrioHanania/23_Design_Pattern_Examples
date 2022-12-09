package Design_Patterns.Structural.Facade.Hotels;

import Design_Patterns.Structural.Facade.Menus.Menu;
import Design_Patterns.Structural.Facade.Menus.NonVegMenu;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        NonVegMenu menu = new NonVegMenu();
        return menu;
    }
}
