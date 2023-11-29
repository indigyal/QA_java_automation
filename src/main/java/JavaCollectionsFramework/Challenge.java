package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Challenge {
    public static void main(String[] args) {

//        // Step 1: Create an ArrayList and populate it with integers
        ArrayList<Integer> numbersA = new ArrayList<>();
//        // Populate arrayList with integers
        numbersA.add(1);
        numbersA.add(2);
        numbersA.add(3);
        numbersA.add(4);
        numbersA.add(5);
//
//        // Step 2: Create a LinkedList and populate it with integers
        LinkedList<Integer> numbersB = new LinkedList<>();
//        // Populate linkedList with integers
        numbersB.add(6);
        numbersB.add(7);
        numbersB.add(8);
        numbersB.add(9);
        numbersB.add(10);
//
//        // Step 3 and 4: Merge and remove elements
        LinkedList<Integer> result = mergeAndReduce(numbersA, numbersB);
//
//        // Step 5: Print the final LinkedList
        System.out.println(result);
    }
    public static LinkedList<Integer> mergeAndReduce(ArrayList<Integer> a, LinkedList<Integer> b ) {
        LinkedList<Integer> result = new LinkedList<>();
        return result;
    }
}











