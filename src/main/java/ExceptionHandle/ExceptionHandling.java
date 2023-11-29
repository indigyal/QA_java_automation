package ExceptionHandle;
/*Exception Handling in Java

The exception handling in Java is to handle the runtime errors so that the normal flow of the application
can be maintained.

Exception could be any abnormal condition in your code.

Exception comes from class Throwable in java.

                                    Throwable
             Exception:                                         Error:
             IOException                                         StackOverflowError
             SQLException                                        VirtualMachineError
             ClassNotFoundException                              OutOfMemoryError
             RuntimeException
               - ArithmeticException
               - NullException
               - IndexOutOfBoundException
                      - ArrayIndexOutOfBound
                      - StringIndexOutOfBound

Keywords:
- try - used to try to run your method
- catch - used to catch an exception
- finally - used to run code
- throw - throw an exception
- throws - declare (exception might occur)

 */


import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("code still runs");
        }

        try{
            int[] arr = new int[5];
            int value = arr[10];
            System.out.println(value);
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("My code is still running");
        }
        System.out.println("++++++++++++");
        try{
            readFile("nonexistent.txt");
        }catch (ArithmeticException e){
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
    public static void readFile(String fileName) throws ArithmeticException{
        if (!fileName.equals("Example.txt")){
            throw new ArithmeticException("File not found: " +fileName);
        }
    }

    String[] arr = {"1,2,3,4,5,6;6,8,9"};
//Programming challenge description:
//Find the intersection of two sorted lists of integers.
//Input:
//Your program should read lines of text from standard input. Each line will contain two comma separated lists of integers in ascending order, one pair of lists per line. The lists are separated by a semicolon.
//Output:
//For each pair of input lists, print to standard output their sorted intersection in ascending order, comma separated, one intersection per line.

//test input 1,2,3,4;4,5,6 expected output: 4
}

