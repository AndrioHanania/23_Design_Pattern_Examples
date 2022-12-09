package Design_Patterns.Creational.Builder.Builders;

import Design_Patterns.Creational.Builder.Items.Burgers.VegBurger;
import Design_Patterns.Creational.Builder.Items.ColdDrinks.Coke;
import Design_Patterns.Creational.Builder.Meal;

public class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addBurger(new VegBurger());
    }

    @Override
    public void buildColdDrink() {
        meal.addColdDrink(new Coke());
    }

    @Override
    public void setType() {
        meal.setType("Veg");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
