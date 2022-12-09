package Design_Patterns.Structural.Proxy.Internet;

public class RealInternet implements Internet {
    @Override
    public void connectToSite(String siteName) {
        System.out.println("connecting to: " + siteName);
    }
}
