package Design_Patterns.Structural.Facade.Hotels;

import Design_Patterns.Structural.Facade.Menus.BothTypeMenu;
import Design_Patterns.Structural.Facade.Menus.Menu;

public class BothTypeRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        BothTypeMenu both = new BothTypeMenu();
        return both;
    }
}
