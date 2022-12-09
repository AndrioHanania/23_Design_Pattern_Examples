package Design_Patterns.Creational.Builder.Items.Burgers;

public class VegBurger extends Burger {
    @Override
    public double getPrice() {
        return 30;
    }

    @Override
    public String getName() {
        return "VegBurger";
    }
}
