package Design_Patterns.Creational.Builder.Items;

import Design_Patterns.Creational.Builder.Items.Packs.Pack;

public interface Item {
    public Pack getPack();
    public double getPrice();
    public String getName();
    public void print();
}
