package OOPConcepts;

public class Truck extends Car{
    public String type;
    public Truck(String make, String model, String color, int year, int doors, String type){
        super(make, model, color, year, doors);
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void haul(){
        System.out.println("hauling cargo!!");
    }

}
