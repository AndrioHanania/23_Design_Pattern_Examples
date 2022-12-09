package Design_Patterns.Creational.AbstractFactoryWethod.Movies.Hollywood;

import Design_Patterns.Creational.AbstractFactoryWethod.Movies.HollywoodMovie;

public class HollywoodActionMovie implements HollywoodMovie {
    @Override
    public void printMovieName() {
        System.out.println("Seven");
    }
}
