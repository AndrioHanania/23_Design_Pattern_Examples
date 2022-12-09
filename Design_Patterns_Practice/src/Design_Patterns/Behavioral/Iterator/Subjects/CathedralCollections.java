package Design_Patterns.Behavioral.Iterator.Subjects;

import Design_Patterns.Behavioral.Iterator.Iterators.CathedralIterator;
import Design_Patterns.Behavioral.Iterator.Iterators.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CathedralCollections implements Subject {
    private List<String> subjects;

    public CathedralCollections(){
        subjects = new ArrayList<>();
        subjects.add("St. Patrick's");
        subjects.add("Notre-Dame de Paris");
        subjects.add("Saint Basil's");
    }

    @Override
    public Iterator createIterator() {
        return new CathedralIterator(subjects);
    }
}
