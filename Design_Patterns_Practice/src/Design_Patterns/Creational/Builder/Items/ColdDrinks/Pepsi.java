package Design_Patterns.Creational.Builder.Items.ColdDrinks;

public class Pepsi extends ColdDrink {
    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getName() {
        return "Pepsi";
    }
}
