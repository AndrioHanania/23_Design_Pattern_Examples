package Design_Patterns.Behavioral.Observer.Observer;

import Design_Patterns.Behavioral.Observer.Observer.Observer;

public class AverageScore implements Observer {
    @Override
    public void update(int runs, int wickets, float overs) {
        System.out.println("Average score:");
        System.out.println("run rate: " + runs / overs);
        System.out.println("predicted score: " + ((runs / overs) * 50));
        System.out.println();
    }
}
