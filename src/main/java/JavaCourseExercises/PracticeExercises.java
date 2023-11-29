package JavaCourseExercises;

import java.util.Arrays;

public class PracticeExercises {
    public static void main(String[] args) {

        int[] arr1 = {3, 9, 3, 4, 5, 0};
        equalElements(arr1);

        int[] arr2 = {4, 2, 3, 4, 5};
        arraySum(arr2);

        int[] arr3 = {2, 4, 6, 2, 9};
        largestNum(arr3);

        int[] arr4 = {1,8,3,4,5,1,2,0,4,5};
        twiceNum(arr4);

        int[] arr5 = {1,2,3,4,5,6,7};
        swapNum(arr5);

        int[] arr6 = {1,2,3};
        int[]arr7 = {0,0,0};
        twoArray(arr6,arr7);

        int[] arr8 = {1,2,3};
        moveLeft(arr8);

        int cigars = 105;
        boolean isWeekend = true;
        boolean result;
        result=squirrels(cigars, isWeekend);
        System.out.println(result);

        int a= 86;
        ticket(a);

        System.out.println("++++++++");

        int b=22;
        multipleOfTwenty(b);

        int c=12;
        multipleOfTen(c);

        int t=8;
        int d=20;
        party(t,d);

        int e=2;
        int f=2;
        int g=4;
        addingNums(e,f,g);

        String str = "Freddy is hungry.";
        System.out.println(fizzBuzz(str));

        int n= (40);
        not20(n);

        int nums = 6;
        boolean vacation =true;
        alarm(nums,vacation);

        boolean isMorning = false;
        boolean isSleeping = true;
        cellPhone(isMorning,isSleeping);

        int y = 12;
        int z = 83;
        doubleDigit(y, z);

        int you = 3;
        int date = 6;
        dinnerDate(you ,date);

        int temperature = 100;
        boolean isSummer = false;
        squirrelsPlay(temperature, isSummer);

        String str2 ="Hello";
        int nn = 1;
        copyString(str2,nn);

        String str3 = "xxhello";
        twoX(str3);

        String str4 = "abcxxxx";
        countingX(str4);

        int teen1 = 19;
        int teen2 = 11;
        int teen3 = 10;
        teen(teen1,teen2,teen3);

        int range1 = 23;
        int range2 = 50;
        rangeNums(range1,range2);

        int num1 = 7;
        int num2 = 2;
        sum10(num1,num2);

        String str5 = "ca";
        twoChar(str5);

        String str6 = "bu";
        threeChar(str6);

        int temp1 = -12;
        int temp2 = 191;
        temps(temp1,temp2);

        boolean aSmile = true;
        boolean bSmile = false;
        inTrouble(aSmile, bSmile);


    }

    //1. Given an array of ints, return true if the array is length 1 or more,
    // and the first element and the last element are equal.
    public static boolean equalElements(int[] nums) {
        System.out.println(nums.length >= 1 && nums[0] == nums[nums.length - 1]);
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }


    //2. Given an array of ints, return the sum of the first 2 elements in the array.
    // If the array length is less than 2, just sum up the elements that exist,
    // returning 0 if the array is length 0.
    public static int arraySum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            int second = arr[i] + 1;
            if (arr.length > 2) {
                int result = arr[0] + arr[1];
                System.out.println(result);
                return result;
            } else if (arr.length < 2) {
                int result = arr[0];
                System.out.println(result);
                return result;
            } else if (arr.length == 0) {
                return 0;
            }
        }
        return 0;
    }

    //3. Given an array of ints of odd length, look at the first, last, and middle values in the array
    // and return the largest. The array length will be a least 1.
    public static int largestNum(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];
        int middle = arr[arr.length / 2];
        System.out.println(Math.max(Math.max(first, last), middle));
        return Math.max(Math.max(first, last), middle);
    }

    //4. Given an int array, return true if the array contains 2 twice, or 3 twice.
    // The array will be length 0, 1, or 2.
    public static boolean twiceNum(int[] arr){
        int count2 =0;
        int count3 =0;
        for(int ar:arr){
            if(ar == 2){
                count2++;
            }if (ar ==3){
                count3++;
            }
        }
        System.out.println(count2 == 2 || count3 == 2);
        return count2 == 2 || count3 == 2;
    }

    //5. Given an array of ints, swap the first and last elements in the array.
    // Return the modified array. The array length will be at least 1.
    public static int swapNum(int[] arr){
        if(arr.length >= 2) {
            int a = arr[0];
            int b = arr[arr.length - 1];
            arr[0] = b;
            arr[arr.length - 1] = a;
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    //6. Given an int array, return a new array with double the length where its last element is the same as the original array,
    // and all the other elements are 0. The original array will be length 1 or more. Note: by default,
    // a new int array contains all 0's.
    public static void twoArray(int [] arr,int[] arr2) {
        int[] result = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        for(int j=0; j<arr2.length; j++){
            result[arr.length+j] = arr2[j];
        }
        System.out.println(Arrays.toString(result));
    }

    //7. Given an array of ints length 3,
    // return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    public static int moveLeft(int[] arr) {
        int[] a = new int[3];
        a[0]= arr[1];
        a[1]= arr[2];
        a[2]= arr[0];
        System.out.println(Arrays.toString(a));
        return 0;
    }

//    8. When squirrels get together for a party, they like to have cigars.
//     A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
//     Unless it is the weekend, in which case there is no upper bound on the number of cigars.
//     Return true if the party with the given values is successful, or false otherwise.
    public static boolean squirrels(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }

    //another way to solve
//    public static boolean cigar(int a,boolean weekend){
//        if (weekend ==true & a >=40){
//            System.out.println(true);
//            return true;
//        }
//        else if(a>=40 && a<=60){
//            System.out.println(true);
//            return true;
//        }
//        System.out.println(false);
//
//        return false;
//
//    }

    //9.You are driving a little too fast, and a police officer stops you.
    // Write code to compute the result, encoded as an int value: 0=no ticket,
    // 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    // If speed is between 61 and 80 inclusive, the result is 1.
    // If speed is 81 or more, the result is 2.
    // Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
    public static int ticket(int a){
        int result = 0;
        if (a <=60){
            result =0;
        }if (a >= 61 && a<= 80 && a!=65) {
            result = 1;
        }if (a >=81 && a!=86 && a!=85){
            result = 2;
        }else if(a==65 | a==85 | a==86){
            result = 3;
            System.out.println(result);
        }
        System.out.println(result);
        return result;
    }

    //10.Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

    public static boolean multipleOfTwenty(int b ){
        if((b%20==1||b%20==2)){
            boolean result = true;
            System.out.println(result);
        }else{
            boolean result = false;
            System.out.println(result);
            return false;
        }
        return false;
    }

    //11. Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    // Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

    public static boolean multipleOfTen(int c ){
        if((c%10==1||c%10==2)){
            boolean result = true;
            System.out.println(result);
        }else{
            boolean result = false;
            System.out.println(result);
            return false;
        }
        return false;
    }


    //12.We are having a party with amounts of tea and candy.
    // Return the int outcome of the party encoded as
    // 0=bad, 1=good, or 2=great.
    // A party is good (1) if both tea and candy are at least 5.
    // However, if either tea or candy is at least double the amount of the other one,
    // the party is great (2).
    // However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

    public static int party(int t, int d){
        int result = 0;
        if (t >=5 && d >=5){
            result =1;
        }
        if (t >= (d*2) || d >= (t*2)) {
            result = 2;
        }
        System.out.println(result);
        return result;
    }

    //13. Given three ints, a b c,
    // return true if it is possible to add two of the ints to get the third.
    public static boolean addingNums(int e, int f, int g){
        boolean result = false;
        if((e+f)==g || (f+g)==e || (e+g)==f){
            result=true;
        }
        System.out.println(result);
        return result;
    }
    //14. Given a string str, if the string starts with "f" return "Fizz".
    // If the string ends with "b" return "Buzz".
    // If both the "f" and "b" conditions are true, return "FizzBuzz".
    // In all other cases, return the string unchanged.
    public static String fizzBuzz(String str) {
        String lowerStr=str.toLowerCase();
        if (lowerStr.charAt(0)== 'f' && lowerStr.charAt(str.length()-1)=='b') {
            return "FizzBuzz";
        }
        if (lowerStr.charAt(0)== 'f') {
            return "Fizz";
        }
        if (lowerStr.charAt(str.length()-1)== 'b') {
            return "Buzz";
        }
        return str;
    }

    //15. Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
    // So for example 38 and 39 return true, but 40 returns false.
    public static boolean not20(int n) {
        boolean result =false;
        if((n%20==19||n%20==18)){
            result = true;
            System.out.println(result);
        }else{
            System.out.println(result);
            return result;
        }
        return result;
    }

    //16. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
    // and a boolean indicating if we are on vacation,
    // return a string of the form "7:00" indicating when the alarm clock should ring.
    // Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
    // Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

    public static boolean alarm(int nums, boolean vacation) {
        boolean results = false;
        if (vacation) {
            //weekdays
            if(nums >= 1 && nums <=5){
                System.out.println("Alarm goes off at 10:00, on vacation");
            }else{
                System.out.println("No alarm needed, on vacation");
            }
        } else {
            if (nums >= 1 && nums <=5) {
                System.out.println("Alarm goes off at 7:00");
            }else{
                System.out.println("Alarm goes off at 10:00");
            }
        }
        return results;
    }

    //17. Your cell phone rings. Return true if you should answer it.
    // Normally you answer, except in the morning you only answer if it is your mom calling.
    // In all cases, if you are asleep, you do not answer.
    public static boolean cellPhone(boolean isMorning, boolean isSleeping) {
        boolean results = false;
        if (isMorning) {
            if (isSleeping) {
                System.out.println("Answer the phone. It's your mom.");
            } else {
                System.out.println("Answer the phone.");
            }
        } else {
            System.out.println("Keep sleeping. Don't answer.");
        }
        return results;
    }

    //18. Given two ints, each in the range 10..99,
    // return true if there is a digit that appears in both numbers,
    // such as the 2 in 12 and 23.
    // (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
    public static boolean doubleDigit(int y, int z){
        boolean result = false;
        int y1=y/10;
        int y2=y%10;
        int z1=z/10;
        int z2=z%10;

        if (y1==z1 || y1==z2 || z1==y2 || y2==z2){
            result = true;
            System.out.println(result);
            return result;
        }
        System.out.println(result);
        return result;
    }

    //19. You and your date are trying to get a table at a restaurant.
    // The parameter "you" is the stylishness of your clothes, in the range 0..10,
    // and "date" is the stylishness of your date's clothes.
    // The result getting the table is encoded as an int value
    // with 0=no, 1=maybe, 2=yes.
    // If either of you is very stylish, 8 or more, then the result is 2 (yes).
    // With the exception that if either of you has style of 2 or less,
    // then the result is 0 (no). Otherwise, the result is 1 (maybe).

    public static int dinnerDate(int you , int date) {
        int result = 1;
        if (you >= 8 || date >= 8) {
            result = 2;
        }
        if (you <= 2 && date <= 2) {
            result = 0;
        }
        System.out.println(result);
        return result;
    }

    //20. The squirrels in Palo Alto spend most of the day playing.
    // In particular, they play if the temperature is between 60 and 90 (inclusive).
    // Unless it is summer, then the upper limit is 100 instead of 90.
    // Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

    public static boolean squirrelsPlay(int temperature, boolean isSummer) {
        boolean result = false;
        if (isSummer) {
            if (temperature >= 60 && temperature <= 100) {
                result = true;
            }
        } else {
            if (temperature >= 60 && temperature <= 90) {
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }

    //21. Given a string and a non-negative int n,
    // return a larger string that is n copies of the original string.

    public static String copyString(String str2, int nn) {
        String result = "";
        for (int i = 0; i < nn; i++) {
            result += str2;
        }
        System.out.println(result);
        return result;
    }

    //22. Given a string, return true if the first instance of "x"
    // in the string is immediately followed by another "x".

    public static boolean twoX(String str3) {
        boolean result = false;
        int i=0;
        if(str3.charAt(i)=='x' && str3.charAt(i+1)=='x'){
            result = true;
            System.out.println(result);
            return result;
        } else {
            System.out.println(result);
            return result;
        }
    }

    //23. Count the number of "xx" in the given string.
    // We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    public static int countingX(String str4) {
        int count = 0;
        for (int i = 0; i < str4.length()-1;i++) {
            if (str4.charAt(i) == 'x' && str4.charAt(i+1) == 'x') {
                count++;
                System.out.println(i);
                System.out.println(count);
               //return count;
            }
        }
        return count;
    }

    //24. We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    // Given 3 int values, return true if 1 or more of them are teen.

    public static boolean teen(int teen1, int teen2, int teen3) {
        boolean result = false;
        if (teen1 <= 19 && teen1 >= 13 || teen2 <=19 && teen2 >=13 || teen3 <= 19 && teen3 >= 13) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

    //25. Given 2 int values, return true if they are both in the range 30..40 inclusive,
    // or they are both in the range 40..50 inclusive.

    public static boolean rangeNums(int range1, int range2) {
        boolean result = false;
        if (range1 >= 30 && range1 <= 50 && range2 >= 30 && range2 <= 50) {
            System.out.println(result);
            result = true;
        }
        System.out.println(result);
        return result;
    }

    //26. Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    public static boolean sum10(int num1, int num2) {
        boolean result = false;
        if (num1 == 10 || num2 == 10 || num1 + num2 == 10) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

    //27. Given a string, take the first 2 chars and return the string
    // with the 2 chars added at both the front and back,
    // so "kitten" yields"kikittenki". If the string length is less than 2,
    // use whatever chars are there.

    public static String twoChar(String str5) {
        if (str5.length() > 2){
            String firstTwoChars = str5.substring(0,2);
            String result = firstTwoChars + str5 + firstTwoChars;
            System.out.println(result);
            return result;
        }
        String result = str5 + str5 + str5;
        System.out.println(result);
        return result;
    }

    //28. Given a string, we'll say that the front is the first 3 chars of the string.
    // If the string length is less than 3, the front is whatever is there.
    // Return a new string which is 3 copies of the front.

    public static String threeChar(String str6) {
        if (str6.length() > 3){
            String firstThreeChars = str6.substring(0,3);
            String result = firstThreeChars + firstThreeChars + firstThreeChars;
            System.out.println(result);
            return result;
        }
        String result = str6 + str6 + str6;
        System.out.println(result);
        return result;
    }

    //29. Given two temperatures, return true if one is less than 0 and
    // the other is greater than 100.

    public static boolean temps(int temp1, int temp2) {
        boolean result = false;
        if ((temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0)) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

    //30. We have two monkeys, a and b, and the parameters aSmile and bSmile
    // indicate if each is smiling. We are in trouble if they are both smiling
    // or if neither of them is smiling. Return true if we are in trouble.

    public static boolean inTrouble(boolean aSmile, boolean bSmile) {
        boolean result = false;
        if ((aSmile && bSmile) || (!aSmile &&!bSmile)) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

}


