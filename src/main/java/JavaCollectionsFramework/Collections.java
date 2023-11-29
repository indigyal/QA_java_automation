package JavaCollectionsFramework;

/* Java Collections Framework

Java collections framework provides an architecture to store and manipulate the group of objects.

Java collections can achieve all the operations that you can perform on data such as searching, sorting, insertion
manipulation and deletion.

What is a collection in Java?
A collection represents a single unit of objects.

This framework provides a ready-made architecture for sorting and manipulation of a group of objects.

Iterable Interface
Collection Interface

List Interface

ArrayList Class - elements can be added or removed, array can be adjusted
--implements list interface, it uses dynamic array to store the elements of the collection
-- it can also store the elements in the order they are added to the collection.
--it can store different types of elements in the collection
--it can be randomly accessed -- order is non synchronized

LinkedList Class
-- is a subclass of arraylist class.
-- implements the list interface
-- maintains the insertion order of the elements
-- maintains te first-in-first-out (FIFO) order in the elements
-- is doubly linked list implementation of the list
-- it stores the elements as nodes linked to the previous element
-- it is not thread safe NOT synchronized
-- faster than ArrayList for manipulation of a group of objects

Vector Class
Vector uses a dynamic array to store the data elements.
It is similar to arrayList but its synchronized and contains many more methods that are not
part of collection framework.

Stack Class
--LIFO (last in first out)
--extends the functionality of vector - meaning it inherits all the methods that vector has.

Queue Interface
priorityQueue Class
Deque Interface
ArrayDeque Class

Set Interface
HashSet Class
Linked HashSet Class
SortedSet Interface
    TreeSet
 */



import java.util.*;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        //to print a particular item from list
        System.out.println(animals.get(1));
        animals.remove(3);
//
        //to find an element from the list
        if (animals.contains("Cat")) {
            System.out.println("yes it does");
        }

        // to print out entire list
        for (String animal : animals) {
            System.out.println(animal);
        }

        // how to add a new element to an array
        String[] fruits={"Apple", "Banana", "Orange", "Melon"};
        List<String> fixedSizeList = Arrays.asList(fruits);

        ArrayList<String> arrayList = new ArrayList<>(fixedSizeList);

        arrayList.add("Kiwi");

        if (arrayList.contains("Strawberry")) {
            System.out.println("yes ");
        }

        arrayList.remove(3);
        System.out.println(fruits);

        for(String ar : arrayList){
            System.out.println(ar);
        }

        ArrayList<Object> exampleList = new ArrayList<>();
        exampleList.add(1);
        exampleList.add("Hello");
        exampleList.add(true);
        exampleList.add(12.33);

        System.out.println("ArrayList elements: ");
        for(Object element : exampleList) {
            System.out.println(element);
        }

        exampleList.set(1,"World");
        for (Object element: exampleList){
            System.out.println(element);
        }
        exampleList.get(3);

        LinkedList<String> linkedList = new LinkedList<>();

        //adding elements to a linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Melon");
        linkedList.add("Melon");

        System.out.println("LinkedList Elements: ");
        for (String element: linkedList){
            System.out.println(element);
        }
        //removing first element
        linkedList.removeFirst();
        linkedList.addFirst("Strawberry");
        linkedList.removeLast();

        System.out.println("After Manipulation of LinkedList: ");
        for (String element: linkedList){
            System.out.println(element);
        }

        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers.get(2));

        System.out.println("Printing all the elements in the Vector: ");

        for(int number: numbers){
            System.out.println(number);
        }

        System.out.println("size: " + numbers.size());
        System.out.println("Is it empty? " + numbers.isEmpty());
        System.out.println("How big?" + numbers.capacity());

        System.out.println("after trim: ");
        numbers.trimToSize();
        System.out.println("How Big: " + numbers.capacity());

        numbers.setSize(30);
        System.out.println("How Big?" + numbers.capacity());
        System.out.println(numbers.get(29));
        System.out.println(numbers.get(11));

        Stack<String> stackOfCards = new Stack<>();

        //pushing new items to the stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        //Displaying the Stack
        System.out.println("Stack -> " + stackOfCards);

        //popping items from the stack
        String cardAtTop = stackOfCards.pop(); // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() -> " + cardAtTop);
        System.out.println("Current Stack -> " + stackOfCards);

        //Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek(); // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.peep() -> " + cardAtTop);
        System.out.println("Current Stack -> " + stackOfCards);

        //Check if the stack is empty
        boolean isStackEmpty = stackOfCards.isEmpty();
        System.out.println("Is the stack empty? " +isStackEmpty);

        //Find the position of an object in the stack
        int position = stackOfCards.search("Queen"); //Returns 1-based position, or 1- if not found
        System.out.println("Position of 'Queen': " + position);

        //Size of the stack
        int size = stackOfCards.size();
        System.out.println("Size of stack: " + size);

        System.out.println("+++++++++++++++");

        //Set interface in Java
        //set has hashSet, which is a collection of unique elements
        /*
        Ordering: HashSet does not guarantee any order of its elements. The order is typically haphazard and
        can change completely when new elements are added.

        Performance: Operations like add, remove, contains, etc., have constant-time complexity, 0(1),
        assuming the hash function disperses elements properly among the buckets.

        Implementation: It is backed by a hash table (actually a HashMap instance).

    --  Use-Case: You should use HashSet when you don't care about the iteration order.
         */

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Melon");
        set.add("Melon");

        System.out.println(set.contains("Apple"));
        System.out.println(set.contains("Melon"));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        System.out.println("++++++++++++++++++++");
        //linkedHashSet class
        //linkedHashSet is a collection of unique elements

        /*
        Ordering: LinkedHashSet maintains a doubly-linked list running through its entries, which means it orders
        its elements based on the insertion order.
        This means when you iterate over a LinkedHashSet, the elements will be returned in the order in which
        they were inserted.

        Performance: LinkedHashSet has slightly lower performance than HashSet (though still constant time:0(1))
        for certain operations due to the added complexity of maintaining the linked list.

        Implementation: It is a HashSet with a linked list running through it, so it is predictably in insertion
        order and still provides quick search capabilities.
         */
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Apple");
        set2.add("Banana");

    }
    /*
    HashMap:
    Purpose: A HashMap is a map-based collection that is used to store key-value pairs.
    It allows you to map unique keys to values.

    Ordering: HashMap does not guarantee any order of the entries. The order can change with the
    addition of new key-value pairs.

    Performance: Operations such as get and put are typically O(1), provided the hash function
    distributes the elements properly among the buckets.

    Implementation: It uses a hash table to store the map. Each key-value pair is stored in a Map.Entry object.

    Null Keys/Values: HashMap allows for one null key and multiple null values.

    Use-case: You should use HashMap when you need to associate a unique key with a specific value
    and you want quick retrieval.

    HashSet:
    Purpose: A HashSet is a set-based collection used to store unique elements.
    It is essentially an implementation of a mathematical set: a collection of distinct objects.

    Ordering: Like HashMap, HashSet also does not guarantee any specific order of the elements.
    The order can appear random and may change over time, especially when new elements are added or removed.

    Performance: Operations like add, remove, and contains have constant time complexity, O(1),
    assuming the hash function distributes the elements evenly among the buckets.

    Implementation: Internally, HashSet uses a HashMap to store its elements. Each element of
    the HashSet is stored as a key in the internal HashMap instance, while the value is a constant
    dummy object since values are not directly used by the HashSet.

    Null Elements: HashSet allows null elements (though it can only have one null element since it
    cannot contain duplicate values).

    Use-case: You should use HashSet when you need to ensure that there are no duplicates and
    you're not concerned about the order of elements.
    */
}
