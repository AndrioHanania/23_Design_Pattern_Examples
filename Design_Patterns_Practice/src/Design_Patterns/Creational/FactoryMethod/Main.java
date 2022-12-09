package Design_Patterns.Creational.FactoryMethod;

import Design_Patterns.Creational.FactoryMethod.Animals.Animal;
import Design_Patterns.Creational.FactoryMethod.Animals.EAnimal;
import Design_Patterns.Creational.FactoryMethod.Factories.AnimalFactory;

//Creating animals using AnimalFactory.
public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal a1 = factory.getAnimal(EAnimal.Duck);
        a1.makeSound();
        Animal a2 = factory.getAnimal(EAnimal.Tiger);
        a2.makeSound();
    }
}
