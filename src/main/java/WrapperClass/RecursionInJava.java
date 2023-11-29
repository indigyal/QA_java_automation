package WrapperClass;

import static WrapperClass.RecursionExample.*;/*
Java Recursions

Recursion in java is a process in which a method calls itself continuously.

A Method in java that calls itself is called recursive method.
 */

public class RecursionInJava {
    public static void main(String[] args) {
        RecursionExample.a();
        System.out.println("Factorial of 5 is: " + RecursionExample.factorial(5));

        int count=15;
        int[] fibonacciSeries = printFibonacci(count);
        System.out.println("Fibonacci Series: ");
        for (int num: fibonacciSeries){
            System.out.println(" "+ num);
        }
        System.out.println("==============");
        getFibo(count-2);


    }
}
class RecursionExample {
    static int count = 0;

    static void a() {
        count++;
        if (count <= 10) {
            System.out.println("hello class" + count);
            a();
        }
    }

    // Find the factorial number for 5; - 5*5*5*5*5 =120
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
    // print Fibonacci series.
   /* 0+1=1
      1+1=2
      2+1=3
      2+3=5
      3+5=8
      8+5=13
      8+13=21
    */ // first way to solve
    static int n1=0, n2=1;
    static int[] printFibonacci(int count){
        int[] series = new int[count];
        series[0] = n1;
        if(count >1) {
            series[1] = n2;
            printFibonacci(series,2,count);
        }
        return series;
    }
    static void printFibonacci(int[] series, int current, int count){
        if(current < count){
            int n3 = n1 +n2;
            series[current] = n3;
            n1= n2;
            n2=n3;
            printFibonacci(series,current +1, count);
        }
    }// second way to solve
    static int N1=0, N2=1, N3=0;
    static void getFibo(int count){
        if(count > 0){
            N3 = N1 + N2;
            N1 = N2;
            N2 = N3;
            System.out.println(" " +N3);
            getFibo(count-1);
        }
    }
}

