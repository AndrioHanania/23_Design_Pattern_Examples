package Design_Patterns.Behavioral.Observer.Subject;

import Design_Patterns.Behavioral.Observer.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
    private List<Observer> observers;
    private boolean changed;
    private int runs;
    private int wickets;
    private float overs;

    public CricketData(){
        observers = new ArrayList<>();
    }

    public void loadData(){
        runs = 5;
        wickets = 4;
        overs = 3;
        changed = true;
        notifyObservers();
    }

    public void setRuns(int runs) {
        this.runs = runs;
        changed = true;
        notifyObservers();
    }
    public void setWickets(int wickets) {
        this.wickets = wickets;
        changed = true;
        notifyObservers();
    }
    public void setOvers(int overs) {
        this.overs = overs;
        changed = true;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null)
            throw new NullPointerException("observer is null");
        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(!changed) return;
        changed = false;
        for(Observer observer: observers)
            observer.update(runs, wickets, overs);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return null;
    }
}
