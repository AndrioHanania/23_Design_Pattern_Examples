package Design_Patterns.Structural.Proxy;

import Design_Patterns.Structural.Proxy.Internet.Internet;
import Design_Patterns.Structural.Proxy.Internet.InternetProxy;

public class Main {
    //The goal is to block the client from unauthorized sites.
    public static void main(String[] args) {
        Internet proxy = new InternetProxy();

        proxy.connectToSite("google");
        proxy.connectToSite("facebook");
        proxy.connectToSite("youtube");
        proxy.connectToSite("instagram");
    }
}
