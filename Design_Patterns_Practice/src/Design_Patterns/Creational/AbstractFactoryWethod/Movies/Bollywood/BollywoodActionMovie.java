package Design_Patterns.Creational.AbstractFactoryWethod.Movies.Bollywood;

import Design_Patterns.Creational.AbstractFactoryWethod.Movies.BollywoodMovie;

public class BollywoodActionMovie implements BollywoodMovie {
    @Override
    public void printMovieName() {
        System.out.println("War");
    }
}
