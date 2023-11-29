package Automation001;

import java.util.Random;
import java.util.Scanner;

public class FlowControlStatements {
    public static void main(String[] args) {
        //If Statements//
        int a = 100;
        float b = 100.20f;

        if (a > b) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
        if (a + b < 150) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }
        //given an int check if the int is less than equal to 10;
        //int x = 9;
        int x = 90;
        if (x < 11 && x == 10) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        //Switch Statements
        int month = 10;
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("enter a valid month");
                break;
        }
        // For Loop Statements
        //print first 10 numbers;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 100; i >= 50; i--) {
            System.out.println(i);
        }
        //print even numbers form 1 to 10;
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        // nested for loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
        String message = "Hello World";
        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            System.out.println("character at index" + i + ": " + character);
        }

        // while loop
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        //user input

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("you have entered a positive number: " + number);

        Scanner scanner1 = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("Option 1");
            System.out.println("Option 2");
            System.out.println("Option 3");
            System.out.println("Enter your choice: ");
            choice = scanner1.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("you have selected option 1");
                    break;
                case 2:
                    System.out.println("you have selected option 2");
                    break;
                case 3:
                    System.out.println("you have selected option 3");
                    break;
                case 4:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid Choice, Pleaee try again");
            }
        } while (choice != 4);

        //input random loop
        Random random = new Random();
        int targetNumber = random.nextInt(10, 1);
        int guess;
        int attempts = 0;

        do {
            System.out.println("guess the number (1-10): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess != targetNumber) {
                System.out.println("Try again..");
            }
        } while (guess != targetNumber);
        System.out.println("great you have guessed the number in : " + attempts);

        // For each loop
        String str = "hello James";
        for (char character : str.toCharArray()) {
            System.out.println(character);
        }
    }
}
/*
Java complies code from top to bottom. The statement in the code are executed
according to the order in which they appear. Java has statements that can be
 used to control the flow of the code. Such statements are called control
 flow statements. This fundamental feature in java which provides easy flow
 of the code.

 There are three types of statements.
 1> Decision Making Statements
 2> Loop Statements
 3> Jump Statements

 1> Decision Making>-- If statements
                    -- Switch Statements

 2> Loop Statements>-- Do While Loop Statements
                    -- While Loop Statements
                    -- For Loop Statements
                    -- For Each Loop Statements

3> Jump Statements>-- Break Statements
                    -- Continue Statements
 */