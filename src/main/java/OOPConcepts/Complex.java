//This is the Main java file that connects the parent(Animal) and child(Cat) that runs the functions.
package OOPConcepts;

public class Complex {
    public static void main(String[] args) {
        Apt apt = new Apt("Studio", "White", "New");
        System.out.println(apt.name + " " + apt.color + " " + apt.type + " ");

        House house = new House("Apt", "White");
        house.complete();
    }
}
