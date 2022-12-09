package Design_Patterns.Behavioral.Iterator.Subjects;

import Design_Patterns.Behavioral.Iterator.Iterators.ArtsIterator;
import Design_Patterns.Behavioral.Iterator.Iterators.Iterator;

public class ArtsCollections implements Subject {
    private int capacity = 3;
    private String[] subjects;
    public ArtsCollections(){
        subjects = new String[capacity];
        subjects[0] = "The Starry Night";
        subjects[1] = "Girl with a Pearl Earring";
        subjects[2] = "Monna Lisa";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
