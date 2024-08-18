package Arrays;

import java.util.Scanner;

public class Calculatorprg {

	public static void main(String[] args) {
        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        // Prompt the user to enter the second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Prompt the user to enter the operation
	        System.out.print("Enter the operation (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        // Variable to store the result
	        double result;

	        // Perform the calculation based on the operator
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                // Check for division by zero
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator.");
	                return;
	        }

	 
	        System.out.println("The result is: " + result);
	    

	}

}
