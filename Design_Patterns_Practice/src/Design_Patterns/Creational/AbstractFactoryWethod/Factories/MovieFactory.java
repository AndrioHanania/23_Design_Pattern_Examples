package Design_Patterns.Creational.AbstractFactoryWethod.Factories;

import Design_Patterns.Creational.AbstractFactoryWethod.Movies.Movie;

public abstract class MovieFactory {
   public abstract Movie getHollywoodMovie();
   public abstract Movie  getBollywoodMovie();

   public Movie getMovie(String type)
   {
      switch (type)
      {
         case "Hollywood":
            return getHollywoodMovie();
         case "Bollywood":
            return getBollywoodMovie();
         default:
            return null;
      }
   }
}
