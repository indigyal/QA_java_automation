package Automation001;
// What is an object?
// Any entity that has a state and behavior is known as an object.

// What is a State?
// Represents the data(value) of an object.

// What is the behavior?
// Represents the behavior(functionality) of an object.

// What is an identity?
// An object identity is implemented by a unique ID.
// The value of the ID is not visible to the external user.

// What is a class?
// A class is a group of objects which have common properties.
// It could be a blueprint from which objects are created.
// A class can contain - fields, methods, constructors, blocks, a nested class and interfaces.

// "New" is a keyword used in Java.
// ex. Scanner scanner = new Scanner(System.in); -- this entire line is a constructor
//



public class ObjectAndClass {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.id = 1;
            s1.name = "Frita";
            System.out.println(s1.id + s1.name);

            Student s2 = new Student();
            s2.id = 2;
            s2.name= "Abdur";
            System.out.println(s2.id+ " "+ s2.name);

            Employee employee1 = new Employee(1,"Daniel","QA");
            employee1.Print();


        }
    }
class Student{
    int id;
    String name;

}
class Employee{
    int id;
    String name;
    String Department;

    public Employee(int id, String name, String Department){
        this.id = id;
        this.name= name;
        this.Department= Department;
    }
    public void Print(){
        System.out.println(id+" "+name+" "+Department);
    }
}