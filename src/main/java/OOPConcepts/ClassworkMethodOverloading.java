package OOPConcepts;

public class ClassworkMethodOverloading {
    public static void main(String[] args) {
        NumberOfCustomers myCustomers = new NumberOfCustomers();

        int Monday = myCustomers.Monday(6,9);
        System.out.println(Monday);

        int Tuesday = myCustomers.Tuesday(2,7);
        System.out.println(Tuesday);

        int Wednesday = myCustomers.Wednesday(2,9);
        System.out.println(Wednesday);

        int Thursday = myCustomers.Thursday(6,10);
        System.out.println(Thursday);

        int Friday = myCustomers.Friday(12,20);
        System.out.println(Friday);
    }
}
class NumberOfCustomers {
    int Monday(int women, int men){
        return women +men;
    }
    int Tuesday(int women, int men){
        return women +men;
    }
    int Wednesday(int women, int men){
        return women +men;
    }
    int Thursday(int women, int men){
        return women +men;
    }
    int Friday(int women, int men){
        return women +men;
    }
}
