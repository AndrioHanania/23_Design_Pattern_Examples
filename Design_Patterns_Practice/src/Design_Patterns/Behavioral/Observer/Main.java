package Design_Patterns.Behavioral.Observer;

import Design_Patterns.Behavioral.Observer.Observer.AverageScore;
import Design_Patterns.Behavioral.Observer.Observer.CurrentScore;
import Design_Patterns.Behavioral.Observer.Subject.CricketData;

//Cricket application.
//Notify viewers about the latest updates in a match
public class Main {
    public static void main(String[] args) {
        AverageScore averageScore = new AverageScore();
        CurrentScore currentScore = new CurrentScore();
        CricketData cricketData = new CricketData();
        cricketData.register(averageScore);
        cricketData.register(currentScore);
        cricketData.loadData();
        cricketData.setRuns(10);
        cricketData.unRegister(averageScore);
        cricketData.setOvers(8);
    }
}
