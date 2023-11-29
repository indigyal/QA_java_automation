package OOPConcepts;
/*
Java Abstraction
Abstraction is one of the four fundamental principles of OOP.
Abstraction is a concept  that allows you to represent the essential features of an object while hiding the
unnecessary details. In Java abstraction is primarily achieved through the use of abstract classes and interface.

An abstract class must be declared with abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have final methods.
It can hae constructors and static methods also.


 */
public class Abstraction {
    public static void main(String[] args) {
        Car1 c = new Honda();
        c.run();
    }
}


