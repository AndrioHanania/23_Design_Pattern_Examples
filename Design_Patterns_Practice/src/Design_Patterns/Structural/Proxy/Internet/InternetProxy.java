package Design_Patterns.Structural.Proxy.Internet;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {
    private Internet internet;
    private List<String> restrictedSites;

    public InternetProxy(){
        this.restrictedSites = new ArrayList<>();
        this.restrictedSites.add("facebook");
        this.restrictedSites.add("instagram");
    }

    @Override
    public void connectToSite(String siteName) {
        if(restrictedSites.contains(siteName))
            System.out.println("connected denied");
        else {
            if(internet == null)
                internet = new RealInternet();
            internet.connectToSite(siteName);
        }
    }
}
