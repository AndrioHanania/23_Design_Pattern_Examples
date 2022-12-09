package Design_Patterns.Structural.Facade.Hotels;

import Design_Patterns.Structural.Facade.Menus.Menu;
import Design_Patterns.Structural.Facade.Menus.VegMenu;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        VegMenu menu = new VegMenu();
        return menu;
    }
}
