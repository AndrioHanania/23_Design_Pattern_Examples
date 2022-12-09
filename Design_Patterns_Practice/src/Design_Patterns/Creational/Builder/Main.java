package Design_Patterns.Creational.Builder;

import Design_Patterns.Creational.Builder.Builders.Director;
import Design_Patterns.Creational.Builder.Builders.MealBuilder;
import Design_Patterns.Creational.Builder.Builders.NonVegMealBuilder;
import Design_Patterns.Creational.Builder.Builders.VegMealBuilder;

//Suppose you are manager of a restaurant.
//We want to create different types of meals using this pattern.
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        director.construct(vegMealBuilder);
        Meal meal1 = vegMealBuilder.getMeal();
        meal1.printMeal();

        director.construct(nonVegMealBuilder);
        Meal meal2 = nonVegMealBuilder.getMeal();
        meal2.printMeal();
    }
}
