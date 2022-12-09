package Design_Patterns.Creational.Builder.Builders;

import Design_Patterns.Creational.Builder.Items.Burgers.ChickenBurger;
import Design_Patterns.Creational.Builder.Items.ColdDrinks.Pepsi;
import Design_Patterns.Creational.Builder.Meal;

public class NonVegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        meal.addBurger(new ChickenBurger());
    }

    @Override
    public void buildColdDrink() {
        meal.addColdDrink(new Pepsi());
    }

    @Override
    public void setType() {
        meal.setType("NonVeg");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
