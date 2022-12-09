package Design_Patterns.Creational.Builder.Builders;

import Design_Patterns.Creational.Builder.Meal;

public interface MealBuilder {
    public void buildBurger();
    public void buildColdDrink();
    public void setType();
    public Meal getMeal();
}
