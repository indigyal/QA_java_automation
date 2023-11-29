package ExceptionHandle;

import java.util.Scanner;

public class CalculatorException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the operation (+, -, *, /): ");
            char operation = scanner.nextLine().charAt(0);

            double result = performOperation(num1, num2, operation);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. ");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }finally{
            scanner.close();
        }

    }
    private static double performOperation(double num1, double num2, char operation){
        double result = 0.0;

        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/':
                if( num2 ==0) {
                    throw new ArithmeticException("Division by zero is not allowed. ");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid Operation: " +operation);
        }
        return result;

    }


    }
