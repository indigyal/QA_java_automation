package OOPConcepts;

public class Car extends Vehicle{
    public int doors;
    public Car(String make, String model, String color, int year, int doors){
        super(make, model, color, year);
        this.doors = doors;
    }
    public int getDoors(){
        return doors;
    }
    public void honk(){
        System.out.println("beep nip!!");
    }
}
