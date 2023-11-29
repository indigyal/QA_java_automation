package JavaArrays;
/*
Java Wrapper Class

Java Wrapper class provides the mechanism to convert primitive into object and reverse.
Java is OOP so, we need to deal with objects many times like Collections, Serialization, Synchronization, etc.
Change the value in Method
Serialization
Sychronization
Utils
Collection FrameWork
 */
public class WrapperClass {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        double primitiveDouble = 3.14;
        Double wrappeddouble = Double.valueOf(primitiveDouble);

        Integer autoboxedInt = primitiveInt;

        int unboxedInt = autoboxedInt;

        System.out.println("primitive int: " + primitiveInt);
        System.out.println("wrapped int: " + wrappedInt);
        System.out.println("primitive Double: " + wrappeddouble);
        System.out.println("autoboxed int: " + autoboxedInt);
        System.out.println("unboxed int: " + unboxedInt);
    }
    // We use 'Integer' and 'Double' wrapper classes to convert primitive 'int' and 'double' values to objects.
    // We demonstrate autoboxing, which automatically converts a primitive 'int' to an 'Integer' object.
    // We demonstrate unboxing, which automatically converts 'Integer' object back to a primitive 'int'.
}
