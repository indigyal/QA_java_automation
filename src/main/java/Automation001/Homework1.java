package Automation001;

public class Homework1 {
    public static void main(String[] args) {
        in100(105);
        near10(8, 13); //0
        multi35(33);
        give2(0, 30);
        inti10(9, 21);
    }
//Given an int n, return true if it is within 10 of 100 or 200.
// Note: Math.abs(num) computes the absolute value of a number.white_check_mark:1

    public static void in100(int n) {
//            if (Math.abs(100-n) <= 10 || (Math.abs(200-n) <= 10)){
//                System.out.println("True");
//            }else {
//                System.out.println("False");
//            }
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    //Given 2 int values, return whichever value is nearest to the value 10,
    // or return 0 in the event of a tie.
    // Note that Math.abs(n) returns the absolute value of a number.
    public static void near10(int a, int b) {
        int diffa = Math.abs(10 - a);
        int diffb = Math.abs(10 - b);

        if (diffa < diffb) {
            System.out.println(a);
        } else if (diffb < diffa) {
            System.out.println(b);
        } else {
            System.out.println(0);
        }

    }
    //Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    // Use the % "mod" operator
    public static boolean multi35(int num){
        if ((num % 3 == 0) || (num % 5 == 0) ){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
    //Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    // or return 0 if neither is in that range.
    public static void give2(int a, int b) {
        int diffa = Math.abs(10-a);
        int diffb = Math.abs(20-b);

        if (diffa < diffb) {
            System.out.println(a);
        } else if (diffb < diffa) {
            System.out.println(b);
        } else {
            System.out.println(0);
        }
    }

    //Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public static void inti10(int a, int b) {
        int diffa = Math.abs(10-a);
        int diffb = Math.abs(20-b);

        if (diffa > 10) {
            System.out.println("True");
        } else if (diffb < 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}