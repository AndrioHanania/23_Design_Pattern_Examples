package Design_Patterns.Creational.Builder.Items.Burgers;

import Design_Patterns.Creational.Builder.Items.Item;
import Design_Patterns.Creational.Builder.Items.Packs.Pack;
import Design_Patterns.Creational.Builder.Items.Packs.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Pack getPack() {
        return new Wrapper();
    }

    @Override
    public void print() {
        System.out.println("burger name: " + getName() + ", price: " + getPrice() + ", pack: " + getPack().getNamePack());
    }
}
