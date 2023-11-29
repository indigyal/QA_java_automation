package JavaArrays;

import java.util.Arrays;

public class ArrayHomeworkOct27 {
    public static void main(String[] args) {
        //AQ1.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        avElements(array1);

        //AQ2.
        int[] array2 = {5, 12, 9, 18, 3, 21};
        minMax(array2);

        //AQ3.
        int[] array3 = {2, 4, 6, 8, 10, 12};
        valExist(array3);

        //AQ4.
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        primeNum(array4);
        System.out.println("---");

        //AQ5.
        int[] array5 = {1, 2, 3, 4, 5, 6};
        int[] array6 = {2, 4, 6, 8, 10, 11};
        comNumbers(array5, array6);
        System.out.println("---");

        //AQM1.
        int[][] array7 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        calArray(array7);
        System.out.println("---");

        //AQM2.
        int[][] array8 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        transpose(array8);
        System.out.println("---");

        //AQM3.
        int[][] array9 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        diagonalSum(array9);
        System.out.println("---");

        //AQM4.
        int[][] array10 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] array11 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        multMatrix(array10, array11);
        System.out.println("---");

        //AQM5.
        int[][] array12 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        matRotate(array12);
        System.out.println("---");


    }

    //Q1. Array Average: Calculate and print the average of all elements in an integer array.
    public static void avElements(int[] nums) {
        int length = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        double average = sum / nums.length;
        System.out.print("Average: " + average);
    }

    //Q2. Array Maximum and Minimum: Find and print both the maximum and minimum elements in an integer array.
    public static void minMax(int[] nums) {
        Arrays.sort(nums);
        System.out.print(nums[0]);
        System.out.println();
        System.out.println(nums[nums.length - 1]);

    }

    //Q3. Array Search: Write a method to check if a specific value exists in an array. Return true if found; otherwise, return false.
    public static void valExist(int[] nums) {
        String match = "false";
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                match = "true";
            }
        }
        System.out.println(match);
    }

    //Q4. Prime Numbers: Given an array of integers, write a program to identify and print all prime numbers from the array.
    public static void primeNum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                System.out.print("" + nums[i]);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    //Q5. Array Intersection: Given two arrays, find and print the elements that are common to both arrays.
    public static void comNumbers(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    System.out.print("" + nums1[i]);
                }

            }
        }
    }

    //QM1. Matrix Sum: Given a 3x3 matrix (a 2D array), calculate and print the sum of all its elements.
    public static void calArray(int[][] nums) {
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                total = total + nums[i][j];
            }
        }
        System.out.print(total);
    }

    //QM2. Matrix Transposition: Transpose a 3x3 matrix (swap rows with columns) and print the resulting matrix.
    public static void transpose(int[][] nums) {
        int[][] array8 = new int[3][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                array8[j][i] = nums[i][j];
            }
        }
        for (int k = 0; k < array8.length; k++) {
            System.out.println(Arrays.toString(array8[k]));
        }
    }

    //QM3. Matrix Diagonal Sum: Calculate and print the sum of both diagonals in a 3x3 matrix.
    public static void diagonalSum(int[][] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    total = total + nums[i][j];
                }
            }
        }
        System.out.println(total);
    }

    //QM4. Matrix Multiplication: Multiply two 3x3 matrices (you can create the matrices as input) and print the resulting matrix.
    public static void multMatrix(int[][] nums1, int[][] nums2) {
        int[][] array3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = nums1[i][j] * nums2[i][j];
            }
        }
        for (int k = 0; k < 3; k++) {
            System.out.println(Arrays.toString(array3[k]));
        }
    }

    //QM5. Matrix Rotation: Rotate a 3x3 matrix 90 degrees clockwise (you can choose the direction) and print the rotated matrix.
    public static void matRotate(int[][] nums){
        //performed a transpose of array
        int[][] array8 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array8[j][i] = nums[i][j];
            }
        }
        //reversed columns
        array8 = reverseArray(array8);
        for (int k = 0; k < array8.length; k++) {
            System.out.println(Arrays.toString(array8[k]));
        }
    }
    public static int[][] reverseArray(int [][] nums) {
        int columnLength = nums[0].length;
        int[][] rarray = new int[nums.length][columnLength];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < columnLength; j++) {
                rarray[i][columnLength - 1 - j] = nums[i][j];
            }
        }
        return rarray;
    }
}


