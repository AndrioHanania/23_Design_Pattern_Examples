package Design_Patterns.Creational.AbstractFactoryWethod.Factories;

import Design_Patterns.Creational.AbstractFactoryWethod.Movies.Bollywood.BollywoodComedyMovie;
import Design_Patterns.Creational.AbstractFactoryWethod.Movies.BollywoodMovie;
import Design_Patterns.Creational.AbstractFactoryWethod.Movies.Hollywood.HollywoodComedyMovie;
import Design_Patterns.Creational.AbstractFactoryWethod.Movies.Movie;

public class ComedyMovieFactory extends MovieFactory {
    @Override
    public Movie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
