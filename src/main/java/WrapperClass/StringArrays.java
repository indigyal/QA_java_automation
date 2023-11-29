package WrapperClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World","!"};
        System.out.println(Arrays.toString(words));
        String sentence = String.join("", words);
        System.out.println(sentence);

//to find if australia is in the array of countries
        String[] countries = {"USA","Canada","UK","Australia","India"};
        String target = "Australia";
        boolean found = false;
        for(String country : countries){
            if (country.equals(target)){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(target + "is in the array");
        }else {
            System.out.println(target + "is not in the given array");
        }
        System.out.println("++++++++++++++++");

        String [] cities = {"New York", "Los Angeles", "Chicago","Houston","Miami"};
        Arrays.sort(cities);

        System.out.println("Sorted Array: ");
        for(String city: cities){
            System.out.println(city);
        }
        String Mydata = "hello, class, this , is Java, Lesson";
        String [] userData =Mydata.split(",");
        for (String data: userData){
            System.out.print(data);
        }
    }
}
