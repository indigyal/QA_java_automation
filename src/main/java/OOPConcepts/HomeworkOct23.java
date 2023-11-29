package OOPConcepts;

public class HomeworkOct23 {
    public static void main(String[] args) {
        monkeyIssues(false, false);
        temperature(101, -2);
        stringOfThree("Hello");
        sum10(9, 9);
        range(31, 44);
        teen(11, 12, 14);
        stringX("Hxello");

        String input = "xxx";
        int result = countXX(input);
        System.out.println("Number of 'xx' : " + result);

        String input1 = "abc";
        int n = 3;
        String result1 = stringTimes(input, n);
        System.out.println("Result: " + result);
    }

  //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
  public static String stringTimes(String str, int n) {
      String result1 = "";

      for (int i = 0; i < n; i++) {
          result1 += str;
      }
      return result1;
  }



    //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        public static void stringX(String a){
            int i = a.indexOf("x");
            if (i == -1){
                System.out.println("false");
            }
            if (i +1 >= a.length()){
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }

        //Count the number of "xx" in the given string. We'll say that overlapping is allowed,
        // so "xxx" contains 2 "xx".
        public static int countXX(String str) {
                int count = 0;
                for (int i = 0; i < str.length() - 1; i++) {
                    if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                        count++;
                    }
                }
                return count;
        }

    //We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    // Given 3 int values, return true if 1 or more of them are teen.
    public static void teen(int a, int b, int c){
            if (a >= 13 && a <=19 || b >= 13 && b <=19 || c >= 13 && c <=19){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }


    //Given 2 int values, return true if they are both in the range 30..40 inclusive,
    // or they are both in the range 40..50 inclusive.

    public static void range(int a, int b) {
        if (a >= 30 && a <= 40 || b >= 30 && b <= 40) {
            System.out.println("true");
        }
        if (a >= 40 && a <= 50 || b >= 40 && b <= 50) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
        //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        public static void sum10 ( int a, int b){
            int sum = a + b;
            if (a == 10 || b == 10) {
                System.out.println("true");
            }
            if (sum == 10) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }

        //Given a string, we'll say that the front is the first 3 chars of the string.
        // If the string length is less than 3, the front is whatever is there.
        // Return a new string which is 3 copies of the front.
        public static void stringOfThree (String str){
            int frontEnd = 3;
            if (str.length() <= 3) {
                System.out.println(str);
            }
            if (str.length() > 3) {
                System.out.println(str);
                // diff of string length and 3
            }
        }


        //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
        public static void temperature ( int tempA, int tempB){
            if (tempA > 100 && tempB < 0 || tempA < 0 && tempB > 100) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        // We are in trouble if they are both smiling or if neither of them is smiling.
        // Return true if we are in trouble.
        public static void monkeyIssues( boolean aSmile, boolean bSmile){
            if (aSmile && bSmile || !aSmile && !bSmile) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }