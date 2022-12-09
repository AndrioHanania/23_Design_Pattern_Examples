package Design_Patterns.Behavioral.Iterator.Subjects;

import Design_Patterns.Behavioral.Iterator.Iterators.Iterator;

public interface Subject {
    public Iterator createIterator();
}
