package OOPConcepts;
/*
Polymorphism is one of the fundamental concepts of OOP. It allows objects of different classes to
be treated as objects of a common super class.
Polymorphism enables you to write more flexible and resusable code by abstracting away the specific
implementation details of objects and focusing on their common behavior.

In polymorphism, 2 mechanisms:
1> Method Overriding
2> Method Overloading

1> Method Overriding
Method overloading occurs when a subclass provides specific implementation for a method that is
already defined in its super class.
The overridden method in the subclass should have the same method signature.
The @Override annotation is often used to indicate that a method is intended to override a super class
method.
When we call a method on an object, java will execute the appropriate implementation of that method
based on the actual type of the object at runtime.

2> Method Overloading
If a class has multiple methods having the same name but different in parameters,
it is known as Method Overloading.
Perform addition of the given numbers but there can be any number of arguments.
If you write the method such as a(int, int) for two parameters, and b(int,int,int) for three
parameters then it may be difficult for you as well as other programmers to understand the behavior
of the method because its name differs.

There are 2 ways to overload the method in Java:
1. by changing the number of arguments
2. by changing the data type

Interface
In java interfaces define a contract for class to implement. Multiple classes can implement the same
interface and each class provides its own implementation for the methods declared in the interface.
We can use polymorphism by creating objects of classes that implements the same interface and
treating them like instances of the interface.

This allows us to work with objects in a generic way without worrying about this specific
implementation.
 */
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("----Creating Animal cass instance with Dog object's makeSound.");
        Animal myAnimal = new Dog();
        myAnimal.makeSound();

        System.out.println("------Creating instance of Animal Class for makeSound method.");
        Animal animal = new Animal();
        animal.makeSound();
    }

}
class Animal {
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println("Woof!");
    }
}

