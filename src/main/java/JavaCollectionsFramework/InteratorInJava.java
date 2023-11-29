package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
In Java Iterator is used to iterate through the elements of a collection.
It is an interface by the java collection.
It allows you to traverse through the elements of a collection regardless of the
type of the collection is implemented.
It provides methods to iterate through the elements of a collection.

Primary Methods:
hasNext()
next()
remove()

 */
public class InteratorInJava {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Melon");

        Iterator<String> fruits = fruit.iterator();

        while (fruits.hasNext()) {
            String element = fruits.next();
            System.out.println(element);
        }

        /* In the above code an ArrayList is created and the iterator is used ot
        iterate through the elements of the ArrayList.
        The next() method is used to get te next element of the ArrayList.
        The hasNext() method is used to check if there are more elements in the
        ArrayList.
        The remove() method is used to remove the element from the ArrayList.
        Iterator is used by the Iterator interface and making an instance of that
        interface.
        */


    }
}
