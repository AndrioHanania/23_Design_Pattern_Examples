package Design_Patterns.Creational.AbstractFactoryWethod.Factories;

public class MovieFactoryProducer {
    public static MovieFactory getFactory(String genre)
    {
        switch (genre)
        {
            case "Comedy":
                return new ComedyMovieFactory();
            case "Action":
                return new ActionMovieFactory();
            default:
                return null;
        }
    }
}
