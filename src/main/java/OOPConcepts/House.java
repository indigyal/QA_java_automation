//This the parent for the child Cat
package OOPConcepts;

public class House {
    public String name;
    public String color;

    public House(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void complete() {
        System.out.println("It is complete");
    }
}
