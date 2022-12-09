package Design_Patterns.Behavioral.Iterator;

import Design_Patterns.Behavioral.Iterator.Iterators.Iterator;
import Design_Patterns.Behavioral.Iterator.Subjects.ArtsCollections;
import Design_Patterns.Behavioral.Iterator.Subjects.CathedralCollections;

//We want to iterate lists of cathedrals and arts.
public class Main {
    public static void main(String[] args) {
        CathedralCollections cathedral = new CathedralCollections();
        System.out.println("Cathedrals: ");
        Iterator cathedralIterator = cathedral.createIterator();
        while (!cathedralIterator.isDone()){
            System.out.println(cathedralIterator.next());
        }
        System.out.println("\nArts: ");
        ArtsCollections artsCollections = new ArtsCollections();
        Iterator artsIterator = artsCollections.createIterator();
        while (!artsIterator.isDone()){
            System.out.println(artsIterator.next());
        }
    }
}
