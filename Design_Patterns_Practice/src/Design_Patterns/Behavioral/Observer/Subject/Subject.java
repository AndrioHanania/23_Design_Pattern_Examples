package Design_Patterns.Behavioral.Observer.Subject;

import Design_Patterns.Behavioral.Observer.Observer.Observer;

public interface Subject {
    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer);
}
