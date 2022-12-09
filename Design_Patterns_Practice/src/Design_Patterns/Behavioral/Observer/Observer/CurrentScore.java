package Design_Patterns.Behavioral.Observer.Observer;

import Design_Patterns.Behavioral.Observer.Observer.Observer;

public class CurrentScore implements Observer {
    @Override
    public void update(int runs, int wickets, float overs) {
        System.out.println("current score:");
        System.out.println("runs: " + runs);
        System.out.println("wickets: " + wickets);
        System.out.println("overs: " + overs);
        System.out.println();
    }
}
