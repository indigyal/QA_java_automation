package Automation001;

public class MethodsAndClass {
    public static void main(String[] args) {
//        myMethod1();
//        myMethod2(2,  5);
//        myMethod3(2,  2);
//        myMethod4();
        //      sleep(true, false);
        diff21(20);


    }

    public static void myMethod1() {
        System.out.println("hello i am being run by your call");
    }

    public static void myMethod2(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int myMethod3(int a, int b) {
        int sum = a * b;
        System.out.println(sum);
        return sum;
    }

    public static void myMethod4() {
        System.out.println("the larger number of given is: " + Math.max(4, 6));
        System.out.println(Math.floor(12.99f));
        String str = "Hello";
        System.out.println(str);
    }
    //The parameter weekday is true if it is a weekday. and the parameter vacation is
//true if we are on vacation. We sleep in if it is not a weekday or we're on
// vacation.
// print true if we sleep in.

    public static void sleep(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
//given an int n, return the difference between n and 21,
//except return double the absolute difference if n is over 21.

    public static void diff21(int n) {
        if (n <= 21) {
            System.out.println(21 - n);
        } else {
            System.out.println((n - 21) * 2);
        }

    }
}

/*
* Methods in Java
* A method in java is a block of code which only runs when it is called
* We can pass data to a method called parameters/arguments.
* Methods are also known as functions.
* Why use methods?
* --code once use it multiple times.
*
* Types of methods:
* --Return Method - returns a datatype
* --Void Method - returns nothing
*
* Return Method: returns a data when called
* Void Method: does not return anything
*
* Method with parameters
* Method without parameters
*
 */