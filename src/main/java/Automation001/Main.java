package Automation001;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println(circle);
        System.out.println("Area of circle: " + circle.getArea());

        System.out.println(rectangle);
        System.out.println("Area of rectangle: " + rectangle.getArea());

    }
}
// Inheritance property= when a class (child of the parent) calls certain
// functions from the parent class.
//Aggregate property=