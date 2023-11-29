package OOPConcepts;
//Inheritance in Java - inheritance in java is a concept in which one object acquires
// all the properties and behaviors of the parent object.
//The idea behind inheritance is that you can create new classes that are built upon
// existing classes. When you inherit from an existing class you can reuse methods and
// variables/fields of the parent class.

//Inheritance is an IS-A relationship. We can use inheritance for Method-overriding and
//code re-usability.

//Class
//Sub-Class or Child Class
//Super/Parent Class
//Extends Keyword

//Types of Inheritance:
// 1> single level (Class A >> Class B)
// 2> multilevel (Class A >> Class B >> Class C) - A is parent - B is a child - C is grandchild
// 3> Hierarchical (Class A >>  Class B && Class A >> Class C) A is parent, B and C are children of A

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", "Black", 2023, 4);
        System.out.println(car.make + " " + car.model + " " + car.color + " " + car.year + " " + car.doors);
        car.start();
        car.honk();
        car.stop();

        Truck truck = new Truck("Volvo", "1000", "White", 2020, 2, "Diesel");
        System.out.println(truck.make + " " + truck.model + " " + truck.color + " " + truck.year + " " + truck.doors + " " + truck.type);
        truck.start();
        truck.haul();
        truck.stop();


    }
}