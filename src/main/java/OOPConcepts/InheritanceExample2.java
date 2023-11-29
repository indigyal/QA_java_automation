package OOPConcepts;

public class InheritanceExample2 {
    public static void main(String[] args) {
        //Basket basket = new Basket("2", "101b" );
        //basket.pay();

        Veg veg = new Veg("1", "21b", "cucumber");
        System.out.println(veg.name+ " "+veg.size+" "+veg.weight+" "+ veg.name+" ");
        veg.pay();
        veg.fresh();
    }
}
class Basket{
    public String size;
    public String weight;
    public Basket(String size, String weight){
        this.size = size;
        this.weight = weight;
    }
    public void pay(){
        System.out.println("pay for it");
    }
}

class Veg extends Basket{
    public String name;
    public Veg(String size, String weight, String name){
        super(size,weight);
        this.name = name;
    }
    public void fresh(){
        System.out.println("this veggie is fresh");
    }
}