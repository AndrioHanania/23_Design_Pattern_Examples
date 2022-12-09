package Design_Patterns.Creational.Builder.Builders;

public class Director {
    private MealBuilder mealBuilder;
    public void construct(MealBuilder mealBuilder)
    {
        this.mealBuilder = mealBuilder;
        mealBuilder.setType();
        mealBuilder.buildBurger();
        mealBuilder.buildColdDrink();
    }
}
