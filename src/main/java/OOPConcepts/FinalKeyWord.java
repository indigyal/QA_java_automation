package OOPConcepts;

public class FinalKeyWord {
    public static void main(String[] args) {
        bike b = new bike();
        bike.run();
    }

}
class bike{
   public static void run(){
       final int speed = 100;
       System.out.println(speed);
   }

}