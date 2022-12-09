package Design_Patterns.Structural.Facade;

import Design_Patterns.Structural.Facade.Menus.Menu;

import java.util.ArrayList;
import java.util.List;

//An application that simulates accessing different menus from
//multiple restaurants in a hotel.
public class Main {

    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();
        List<Menu> menus = new ArrayList<>();
        menus.add(keeper.getVegMenu());
        menus.add(keeper.getNonVegMenu());
        menus.add(keeper.getBothTypeMenu());
        System.out.println();
        for(Menu menu: menus)
            menu.show();

    }
}
