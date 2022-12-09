package Design_Patterns.Creational.Builder.Items.Burgers;

public class ChickenBurger extends Burger {
    @Override
    public double getPrice() {
        return 35;
    }

    @Override
    public String getName() {
        return "ChickenBurger";
    }
}
