package Design_Patterns.Behavioral.Iterator.Iterators;

public interface Iterator {
    public void first();//reset to first element
    public String next();
    public boolean isDone();
    public String currentItem();
}
