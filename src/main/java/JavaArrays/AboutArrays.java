package JavaArrays;
/* Java Arrays
In Java an Array is a data structure that allows you to store multiple values of the same data type in a single variable.
It is a container that can hold a fixed number of elements, and these elements can be accessed using index.
Arrays are widely used in java for organizing and manipulating collections of data.

Declaration and Initialization:
int[] myArray ={1,2,3,4,5,77,0};

Array Size:
The size of an array is fixed when it's created, and you cannot change it later.

Accessing Elements:
Array elements are accessed using 0 based index, first element being 0 index.
Using a loop to access an array is most common.

Array Length:
.length method is used to get the size of an array.

Array and Objects:
In Java, arrays are objects, which means they have certain methods and properties like length.
However, they are not an instance of classes, they are specific to an object.

Types of Arrays:
int, String, char, double, etc.
single dimension array
multi-dimension array
 */

import java.util.Arrays;

public class AboutArrays {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Element ar index 0: " + num[0]);
        System.out.println("Element ar index 1: " + num[1]);
        System.out.println("Element ar index 9: " + num[9]);

        for (int i=0; i <= num.length;i++ ){
            System.out.print(i);
        }
        int [] numb = new int[5];
        numb[0]= 1;
        numb[1]= 2;
        numb[2]= 3;
        numb[3]= 4;
        numb[4]= 5;

        for (int i = 0; i <= numb.length;i++){
            System.out.println(i);
        }
        int [] arrayTwo = {1,2};
        int [] firstlast = {1,2,3,4,5,6};

        int [] original = {1,2,3};
        int [] reverse = reverse(original);
        System.out.println(Arrays.toString(reverse));

        System.out.println("-------------------------");

        int [] array1 = {1,2,4,5};
        int [] array2 = {1,2,4,5,1,3};
        boolean result1 = unlucky1(array1);
        boolean result2 = unlucky1(array2);

        System.out.println(result1);
        System.out.println(result2);

        int [] fix23 = {};
        int [] unlucky = {};

        int [] sumOfAll = {1,2,3};
        System.out.println();

        int [] myArray = {1,2,3,4};
        int [] result = makeEnds(myArray);
        System.out.println(result);
    }

    //Give an int array length 2, return true if it does not contain a 2 or 3.
        public static boolean arrayTwo(int[] nums){

        return nums[0] !=2 && nums[0]!= 3 && nums[1]!=2 && nums[1]!=3;
        }

    //Given an array on ins, return true if 6 appears as either
    //The first or last element in the array. The array will be length 1 or more.
        public static boolean firstlast(int[] nums){
            return nums.length >= 1 && (nums[0] == 6 || nums[nums.length -1] ==6);
         }

    //Given an array of ints length 3, return a new array with the elements in reverse order,
    //so {1,2,3} becomes {3,2,1}
         public static int[] reverse(int[]nums){
            int[] result = new int [3];
            //logic
            result[0] = nums[2];
            result[1] = nums[1];
            result[2] = nums[0];
            return result;
         }
    //Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
    //set the 3 element to 0. Return changed array.
        public static int[] fix23(int[] nums){
            for (int i = 0; i < nums.length -1; i++) {
                if (nums[i] == 2 && nums[i+1] ==3){
                    nums[i + 1 ] = 0;
                }
            }
            return nums;
        }
    //We will say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    //Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        public static boolean unlucky1(int[] nums){
            int len = nums.length;

            if (len >=2 && (nums[0]==1) && (nums[1]==3)){
                return true;
            }
            if (len >= 3 && (nums[len-2]==1 && nums[len-1]==3)){
                return true;
            }
            return false;
        }
    // given an array of ints length 3, return the sum of all the elements.
        public static int sumOfAll(int[] nums) {
            if (nums.length ==3){
                return nums[0] + nums[1] + nums[2];
            } else {
                throw new IllegalArgumentException("Array length must be 3");
            }

        }
    // given an array of ints, return a new array length 2 containing the first and last elements
    //from the original array. The original array will be length 1 or more.
        public static int[] makeEnds(int[] nums){
            if (nums.length >=1) {
                int [] result = {nums[0], nums[nums.length - 1]};
                System.out.println(result);
                return result;
            } else {
                throw new IllegalArgumentException("Array length must be 1 or more");
            }
        }


}
