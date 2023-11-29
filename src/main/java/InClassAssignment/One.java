package InClassAssignment;

public class One {
    public static void main(String[] args) {
    int[]arr={1,3,4,5,6,1,2,3,5,6};
        sequence(arr);

    int[]arr1={0,1,2,3,4,5};
    preceding(arr1);

    int[]arr2={1,2,9,2,9,2,1,2,7};
    triples(arr2);




    }
    public static boolean sequence(int[]arr){
        for (int i =0; i < arr.length-2; i++){
            if(arr[i] == 1 && arr[i]+1 == 2 && arr[i] +2 ==3){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
    public static boolean preceding(int[]arr1){
        for (int i= 0; i < arr1.length-2; i++){
            if(arr1[i] == 0 && arr1[i] + 1 == 1 && arr1[i] +2 ==2){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
    //given an array of ints, we'll say a triple is a value appearing 3 times in an array.
    //Return true if the array has a triple. Return false, if it doesnt.
    public static boolean triples(int[]arr2){
        for (int i = 0; i< arr2.length-2; i++){
            int first = arr2[i];
            if(arr2[i] == first && arr2[i +1]  == first && arr2[i+2]  == first){
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
}
