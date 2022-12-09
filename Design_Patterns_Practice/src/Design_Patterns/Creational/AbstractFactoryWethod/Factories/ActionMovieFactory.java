package Design_Patterns.Creational.AbstractFactoryWethod.Factories;

import Design_Patterns.Creational.AbstractFactoryWethod.Movies.Bollywood.BollywoodActionMovie;
import Design_Patterns.Creational.AbstractFactoryWethod.Movies.BollywoodMovie;
import Design_Patterns.Creational.AbstractFactoryWethod.Movies.Hollywood.HollywoodActionMovie;
import Design_Patterns.Creational.AbstractFactoryWethod.Movies.HollywoodMovie;

public class ActionMovieFactory extends MovieFactory {
    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
