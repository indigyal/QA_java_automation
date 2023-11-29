//This is the child for the parent House
package OOPConcepts;

public class Apt extends House {
    public String type;

    public Apt(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }

    public void Size() {
        System.out.println("Apt is small!");
    }
}
