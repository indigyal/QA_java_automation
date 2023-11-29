package JavaCourseExercises;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 11);
        System.out.println(boolMethod());
        System.out.println(stringMethod());

    }
    public static boolean shouldWakeUp(boolean isBarking,int hourOfDay){
        boolean wakeup = false;
        if(hourOfDay < 8 || hourOfDay > 22){
            wakeup = true;
        }
        return wakeup;
    }
    // Create a method that return boolean value
    public static boolean boolMethod() {
        return true;
    }
    // Create a method that returns string
    public static String stringMethod(){
        String str = "Hello";
        return str;
    }
    // Create a method that returns array
}

//


// Create a method that return two dimension array
// Create a method that returns double
// Create a method that returns float
// Create a method that returns byte
