package OOPConcepts;
/*
Encapsulation in java
Encapsulation in java is process of wrapping the code and data in a single until.
Getter and setter methods are examples of encapsulation.

 */
public class Encapsulation {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);

        //access the object's data through getter methods
        System.out.println("Name: " + person1.getName());

        //use setter method to modify the age
        person1.setAge(35);

        //call a method to introduce the person
        person1.introduce();
    }
}
class Person{
    //private instance variables (attributes)
    private String name;
    private int age;

    //public constructor to initialize the object
    public Person(String name, int age){
        this.name = name;
        setAge(age); //use a setter method to set the age
    }
    //getter method to access the name
    public String getName(){
        return name;
    }
    //setter method to set the age with validation
    public void setAge(int age){
        if (age >= 0 && age <= 120){
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
    //public method to introduce the person
    public void introduce(){
        System.out.println("Hi, I'm " + name + " and I'm"  + age + " years old.");
    }
}