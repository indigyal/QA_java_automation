package InClassAssignment;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        String sen = "This yak is an animal";
        System.out.println(yakRemoval(sen));

        compareNot("not a sentence.");
        compareNot2("this is a cold day");

        int [] arr1 = {1,2,3,9,1,2,3,9,1,2,3,9};
        numberNine(arr1);

    }

    public static String yakRemoval(String s) {
        String result = "";
        String[] words = s.split(" ");
//        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if( word.length() >= 3 && word.charAt(0) == 'y' && word.charAt(2) == 'k'){
                continue;
            }
            result =  result + " "+ word;
        }
        return result;
    }
    /*
    Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.
     */
    public static String compareNot(String str){
       String str2 = "not";
       if(str.charAt(0) == 'n' && str.charAt(1) == 'o' && str.charAt(2) == 't'){
           System.out.println(str);
           return str;
       }else {
           System.out.println(str2 +str);
           return str2 +str;
       }

    }
    public static String compareNot2(String str){
            if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
                System.out.println(str);
                return str;
            }
        System.out.println("not " + str);
            return "not " + str;
    }

    // Given an array of ints, return the number of 9s in the array.
    public static int numberNine(int[] arr){
        int result = 0;
        for(int i = 0; i< arr.length; i++){
            if (arr[i] == 9){
              result++;
            }
        }
        System.out.println(result);
        return result;
    }
}
