package ExceptionHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionExample2 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the array is out of values: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("math error is here" + e.getMessage());
        } finally {
            System.out.println("this is my code continued");
        }
        System.out.println("+++++++++++++++++++");
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("age can not be in negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("invalid age: " + e.getMessage());
        }
        System.out.println("+++++++++++++++++++");
        try {
            System.out.println("first try block is started!!");
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[4]);
            } catch (ArrayIndexOutOfBoundsException innerException) {
                System.out.println("inner catch block: " + innerException.getMessage());
            }
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException outerException) {
            System.out.println("outer catch block" + outerException.getMessage());
        }
        System.out.println("program after try catch blocks.");

        System.out.println("+++++++++++++++++++");

        try {
            FileInputStream fileInputStream = new FileInputStream("doesnot.txt");
            int data = fileInputStream.read();
            System.out.println(data);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("final block executed");
        }
        //challenge#1 for user to input a numerator/denominator then divide the numbers and print exception/result
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter Numerator");
            int numerator = scanner.nextInt();

            System.out.println("Enter Denominator");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("cannot do it" + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Numerator/Denominator mismatch" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("end here");
        }

        //challenge#2 user chooses math choice, and enters two values, need to perform choice, and print appropriate
        //exceptions as necessary.
    }

}