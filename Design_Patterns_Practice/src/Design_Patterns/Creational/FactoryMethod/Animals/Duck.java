package Design_Patterns.Creational.FactoryMethod.Animals;

public class Duck implements Animal {
    @Override
    public void makeSound() {
        System.out.println("wack wack");
    }
}
