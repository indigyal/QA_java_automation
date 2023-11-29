package MathMethods;
public class mathClass {
    public static void main(String[] args) {
        int num1 = -5;
        double num2 = 3.14;
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));

        int a = 5;
        int b = 10;
        int c = 2;
        int d = 8;

        System.out.println(Math.max(a, Math.max(b,Math.max(c,d))));

        double num3 = 3.49;
        double num4 = 3.51;
        System.out.println(Math.round(num3));
        System.out.println(Math.round(num4));

        double num5 = 9.0;
        double num6 = 16.0;
        System.out.println(Math.sqrt(num5));
        System.out.println(Math.sqrt(num6));

        double base = 2.0;
        double exponent = 3.0;
        System.out.println(Math.pow(base, exponent));

        double num7 = 4.9;
        double num8 = 7.1;
        System.out.println(Math.floor(num7));
        System.out.println(Math.floor(num8));

        double randomValue = Math.random();
        System.out.println(randomValue);

        String text = "Hello, World!";
        char character = text.charAt(7);
        System.out.println(character);

        int length = text.length();
        System.out.println(length);

        String subtext = text.substring(0,5);
        System.out.println(subtext);

        boolean contains = text.contains("World");
        System.out.println(contains);

        String[] words = {"Hello", "World"};
        String joined = String.join(", ", words);
        System.out.println(joined);

        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.println(isEmpty);

        String result = str1.concat(str2);
        System.out.println(result);

        String replaced = text.replace("World", "Java");
        System.out.println(replaced);

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println(isEqualIgnoreCase);

        String textit = "apple,banana,grape";
        String[] fruits = textit.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String text12 = "Hello, World!";
        int index = text12.indexOf("World");
        System.out.println(index);

        String textw = "Hello, World!";
        String lowercaseText = textw.toLowerCase();
        System.out.println(lowercaseText);

        String textq = "Hello, World!";
        String uppercaseText = textq.toUpperCase();
        System.out.println(uppercaseText);

        String texte = "    Hello, World!   ";
        String trimmedText = texte.trim();
        System.out.println(trimmedText);



    }
}

/*
 *Math. these methods
 * Math.abs
 * Math.max
 * Math.round
 * Math.sqrt
 * Math.pow
 * Math.nextUp
 * Math.nextDown
 * Math.floor
 * Math.random
/*
 * String.  these methods
 * charAt
 * length
 * substring
 * contains
 * join
 * equals
 * isEmpty
 * concat
 * replace
 * equalsIgnore
 * split
 * indexOf
 * toLowerCase
 * toUpperCase
 * trim
 */
