package Design_Patterns.Behavioral.Iterator.Iterators;

import Design_Patterns.Behavioral.Iterator.Iterators.Iterator;

import java.util.List;

public class CathedralIterator implements Iterator {
    private List<String> subjects;
    private int currPos = 0;

    public CathedralIterator(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public void first() {
        currPos = 0;
    }

    @Override
    public String next() {
        String str = subjects.get(currPos);
        currPos++;
        return str;
    }

    @Override
    public boolean isDone() {
        return currPos == subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(currPos);
    }
}
