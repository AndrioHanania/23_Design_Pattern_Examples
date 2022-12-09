package Design_Patterns.Creational.Builder.Items.ColdDrinks;

import Design_Patterns.Creational.Builder.Items.Packs.Bottle;
import Design_Patterns.Creational.Builder.Items.Item;
import Design_Patterns.Creational.Builder.Items.Packs.Pack;

public abstract class ColdDrink implements Item {

    @Override
    public Pack getPack() {
        return new Bottle();
    }

    @Override
    public void print() {
        System.out.println("coldDrink name: " + getName() + ", price: " + getPrice() + ", pack: " + getPack().getNamePack());
    }
}
