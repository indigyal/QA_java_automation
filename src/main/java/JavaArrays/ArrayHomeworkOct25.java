package JavaArrays;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayHomeworkOct25 {
    public static void main(String[] args) {
        //A1
        int[] nums = {1, 2, 3, 40, 5};
        System.out.println(sumAll(nums));

        System.out.println("-------------------");

        //A2
        System.out.println(maxValue(nums));

        System.out.println("-------------------");

        // A3
        System.out.println(minValue(nums));

        System.out.println("-------------------");

        //A4
        int[] oldArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(moveRight(oldArray)));

        System.out.println("-------------------");

        //A5
        int[] array1 = new int[]{50, 3, 100, 89};
        System.out.println(Arrays.toString(sorting(array1)));

        System.out.println("-------------------");

        //A6
        int[] original = {1, 3, 5, 7, 9};
//        int [] reverseArray = reverseArray(original);
        System.out.println(Arrays.toString(reverseArray(original)));

        System.out.println("-------------------");

//        //A7
        int[] numbers = {1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 0, 1};
        dupArray(numbers);

        System.out.println("-------------------");

//        //A8
        int [] array3= {11, 2, 25, 6, 33, 20};
        numOdd(array3);
        System.out.println("-------");
        numEven(array3);


        System.out.println("-------------------");
//
        //A9
        int [] arr= {1,2,4,5};
        missingNum(arr);

        System.out.println("-------------------");

        //A10
        int[] unsortedArray = {3, 1, 2, 2, 1, 4, 5, 3};
        int[] uniqueUnsorted = removeDup(unsortedArray);
        System.out.println(Arrays.toString(uniqueUnsorted));


    }

    // 1. Sum of Array Elements: Write a method to calculate and return the sum of all elements in an integer array.
    public static int sumAll(int[] nums) {
        int out = 0;
        for (int element : nums) {
            out = out + element;
        }
        return out;
    }

    // 2. Find Maximum Value: Write a method to find and return the maximum value in an integer array.
    public static int maxValue(int[] nums) {
        int[] anArray = {2, 11, 7, 75, 56};
        int maximum = anArray[0];
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > maximum) {
                maximum = anArray[i];
            }
        }
        return maximum;
    }


    // 3. Find Minimum Value: Write a method to find and return the minimum value in an integer array.
    public static int minValue(int[] nums) {
        int[] anArray = {-2, 11, -7, 45, 0};
        int smallest = anArray[0];
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < smallest) {
                smallest = anArray[i];
            }
        }
        return smallest;
    }

    // 4. Array Rotation: Given an integer array,
    // write a method to rotate the elements of the array to the right by a specified number of positions.

    public static int[] moveRight(int[] array1) {
        int a1l = array1.length;
        int[] array2 = new int[a1l];
        for (int i = 0; i < a1l; i++) {
            if (i == 0) {
                array2[i] = array1[(a1l - 1)];
            } else {
                array2[i] = array1[i - 1];
            }

        }
        return array2;
    }

    //5. Array Sorting: Write a method to sort an integer array in ascending order using a sorting algorithm.
    public static int[] sorting(int[] array1) {
        Arrays.sort(array1);
        return array1;
//        System.out.println("Ascending Array: ");
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i]);
//        }
    }

    //6. Array Reversal: Write a method to reverse the elements of an integer array without using any
    // additional data structures
    public static int[] reverseArray(int[] array1) {
        int a1l = array1.length;
        int[] array2 = new int[a1l];
        //logic
        for (int i = 0; i < a1l; i++) {
            array2[i] = array1[a1l - 1 - i];
        }

        return array2;
    }

    //
    //7. Duplicate Elements: Write a method to find and count duplicate elements in an integer array.
    public static void dupArray(int[] names) {
        int n = names.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = 1 + 1; j < n; j++) {
                    if (names[i] == names[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println("duplicate elements " + names[i] + " " + " count " + count);
                }
            }
        }
    }

        //8. Even/Odd Count: Write a method to count the number of even and odd elements in an integer array.
        public static void numOdd(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 != 0) {
                    System.out.print(nums[i]);
                    System.out.print(", ");
                }
            }
        }
    public static void numEven(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i]);
                System.out.print(", ");
            }
        }
    }


//    //9. Find Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
//    // write a method to find the missing number.
    public static void missingNum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                System.out.print(nums[i]-1);
                System.out.print(",");
                break;
            }

        }
    }

//
    //10. Remove Duplicates: Write a method to remove duplicate elements from a sorted or unsorted integer array and
    // return a new array without duplicates.
    public static int[] removeDup(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        Arrays.sort(nums);

        int uniqueCount = 1;
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != current) {
                current = nums[i];
                nums[uniqueCount] = current;
                uniqueCount++;
            }
        }
        return Arrays.copyOf(nums, uniqueCount);
    }
}