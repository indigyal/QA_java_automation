package OOPConcepts;

public class MethodOverloading {
    public static void main(String[] args) {
        MathUtil myUtil = new MathUtil();

        int result1 = myUtil.add(2,3);
        System.out.println(result1);

        int result2 = myUtil.add(2,2,2);
        System.out.println(result2);

        double result3 = myUtil.add(10.75,.25);
        System.out.println(result3);

        String result4 = myUtil.concat("Hello ", "James");
        System.out.println(result4);

        String result5 = myUtil.concat("Hello ", 10);
        System.out.println(result5);
    }
}
class MathUtil {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    String concat(String a, String b){
        return a+b;
    }
    String concat(String a, int b){
        return a+b;
    }
}