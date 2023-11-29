package OOPConcepts;

public class Vehicle {
    public String make;
    public String model;
    public String color;
    public int year;

public Vehicle(String make, String model, String color, int year){
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
}
public void start(){
    System.out.println("Starting vehicle");
}
public void stop(){
    System.out.println("Stopping vehicle");
}

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
