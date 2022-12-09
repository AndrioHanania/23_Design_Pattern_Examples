package Design_Patterns.Creational.Builder.Items.ColdDrinks;

public class Coke extends ColdDrink {
    @Override
    public double getPrice() {
        return 12;
    }

    @Override
    public String getName() {
        return "Coke";
    }
}
