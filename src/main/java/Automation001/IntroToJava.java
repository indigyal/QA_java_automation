package Automation001;

public class IntroToJava {

    public static void main(String[] args) {

        System.out.println("Hello Class");
        byte num1 = 100;
        short num2 = 5000;
        int num3 = 50000;
        long num4 = 15000000L;
        float num5 = 3.14f;
        double num6 = 22.4875d;
        boolean bool = true;
        char ch= 'a';
        String str = "this is a string in java";
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(bool);
        System.out.println(ch);
        System.out.println(str);

        //Understanding Operators
        int a = 10;
        int b = 2;

        int c = a + b;
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);

        int d = a++;
        System.out.println(d);

        int e = a--;
        System.out.println(e);

        int f = --a;
        System.out.println(f);

        int g = ++a;
        System.out.println(g);

        int x = 100;
        System.out.println(x);

        int y = 5;
        y += 3;
        System.out.println(y);

        y -= 3;
        System.out.println(y);

        y /= 2;
        System.out.println(y);

        y |= 2;
        System.out.println(y);

        y ^= 2;
        System.out.println(y);

        y<<= 2;
        System.out.println(y);

        y >>= 2;
        System.out.println(y);

        int v = 100;
        int n = 50;

        System.out.println(v == n);
        System.out.println(v != n);
        System.out.println(v < n);
        System.out.println(v > n);
        System.out.println(v >= n);
        System.out.println(v <= n);

        String letters = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(letters.length());
        System.out.println("these are the English alphabets" + letters);
        System.out.println(letters.toUpperCase());

        System.out.println(letters.indexOf("m"));
    }
}

// byte - -128 to 127
/*
short - -32768 to 32767
int - -2147483848 to 2147483647
long - -9bill< to + 9bill>
float - is number with decimal till 7 places
double - fractional numbers till 15 decimal places
boolean - true or false
char - 'a' - 'z'
String (class) - this is a string

Operators In Java
Arithmetic Operators
Addition +
Subtraction -
Division /
Multiplication *
Modulus %
Increment ++
Decrement --

Assignment Operators
= equals to
+= plus or equals to
-= minus or equals to
*= multiply or equals to
/= divide or equals to
 %= modulus or equals to
&= and or equals to
|= not or equal to
^= root equals to
>>= greater than or equals to
<<= less than or equals to

Comparison Operators
 ==
 !=
 >
 <
 >=
 <=

 Logical Operators
&& -- and
|| -- or
! -- NOT
*/