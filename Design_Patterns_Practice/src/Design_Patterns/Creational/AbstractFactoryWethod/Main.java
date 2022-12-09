package Design_Patterns.Creational.AbstractFactoryWethod;

import Design_Patterns.Creational.AbstractFactoryWethod.Factories.MovieFactory;
import Design_Patterns.Creational.AbstractFactoryWethod.Factories.MovieFactoryProducer;
import Design_Patterns.Creational.AbstractFactoryWethod.Movies.Movie;

//An application that utilizes different types of movies with
//different genres.
//We want to utilize this pattern for creation of each type of movie.
public class Main {
    public static void main(String[] args) {
        MovieFactory movieFactory = MovieFactoryProducer.getFactory("Comedy");
        Movie movie1 = movieFactory.getMovie("Hollywood");
        Movie movie2 = movieFactory.getMovie("Bollywood");
        System.out.println("Comedy Movies:");
        movie1.printMovieName();
        movie2.printMovieName();

        movieFactory = MovieFactoryProducer.getFactory("Action");
        movie1 = movieFactory.getMovie("Hollywood");
        movie2 = movieFactory.getMovie("Bollywood");
        System.out.println("\nAction Movies:");
        movie1.printMovieName();
        movie2.printMovieName();
    }
}
