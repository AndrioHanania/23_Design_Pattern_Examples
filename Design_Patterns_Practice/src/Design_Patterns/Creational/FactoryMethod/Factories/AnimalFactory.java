package Design_Patterns.Creational.FactoryMethod.Factories;

import Design_Patterns.Creational.FactoryMethod.Animals.Animal;
import Design_Patterns.Creational.FactoryMethod.Animals.Duck;
import Design_Patterns.Creational.FactoryMethod.Animals.EAnimal;
import Design_Patterns.Creational.FactoryMethod.Animals.Tiger;

public class AnimalFactory {
    public Animal getAnimal(EAnimal animal)
    {
        switch (animal)
        {
            case Tiger:
                return new Tiger();
            case Duck:
                return new Duck();
            default:
                return null;
        }
    }
}
