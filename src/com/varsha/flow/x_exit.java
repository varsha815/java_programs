package com.varsha.flow;
import java.util.Scanner;
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
//1. Start
//        2. Create a variable 'sum' and set it to 0
//        3. Create a variable 'input' of type String
//        4. Display a message to the user to enter numbers (enter 'x' to stop)
//        5. Start a loop that continues until a break statement is encountered
//        5.1 Read the input from the user
//        5.2 If the input is equal to 'x' (case-insensitive), exit the loop
//        5.3 Try to parse the input as an integer
//        5.3.1 If the input is a valid integer, add it to the 'sum' variable
//        5.3.2 If the input is not a valid integer, display an error message
//        6. Print the sum of all the numbers entered
//        7. End


public class x_exit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input;

        System.out.println("Enter numbers (enter 'x' to stop):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to stop.");
            }
        }

        System.out.println("Sum of all the numbers entered: " + sum);
    }
}
