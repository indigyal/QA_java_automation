package ExceptionHandle;

import java.util.Arrays;
import java.util.Scanner;

/* Challenge: Word Length Counter

Create a Java program that counts the length of words in a given sentence while handling exceptions gracefully.

Here are the requirements:
1. Prompt the user to enter a sentence containing words separated by spaces.
2. Split the sentence into words based on spaces.
3. Implement exception handling to handle the following scenarios:
 a. If the user enters an empty sentence (no words), catch the IllegalArgumentException and display an error message.
 b. If the user enters an exceptionally long word (e.g., longer than 50 characters),
     catch the StringIndexOutOfBoundsException and display an error message.
 c. Display the count and length of each word in the sentence.

 */
public class HomeworkNov1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Write a sentence.");
            String inputStr = scanner.nextLine();
            if(inputStr.length() == 0) {
                throw new IllegalArgumentException("Input can not be blank");
            }
            if(inputStr.length() >= 50){
                throw new StringIndexOutOfBoundsException("Words cannot exceed 50 characters.");
            }
            String[] inputStrArray = inputStr.split(" ");

            for (int i=0; i< inputStrArray.length; i++){
                System.out.println(inputStrArray[i]);
                System.out.println(inputStrArray[i].length());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument catch block triggered.");
            System.out.println(e.getMessage());

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds catch block triggered.");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("finally block triggered");
        }
    }
}
