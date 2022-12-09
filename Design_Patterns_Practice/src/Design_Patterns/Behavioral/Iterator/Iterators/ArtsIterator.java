package Design_Patterns.Behavioral.Iterator.Iterators;

import Design_Patterns.Behavioral.Iterator.Iterators.Iterator;

public class ArtsIterator implements Iterator {
    private String[] subjects;
    private int currPos = 0;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public void first() {
        currPos = 0;
    }

    @Override
    public String next() {
        String str = subjects[currPos];
        currPos++;
        return str;
    }

    @Override
    public boolean isDone() {
        return currPos == subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[currPos];
    }
}
