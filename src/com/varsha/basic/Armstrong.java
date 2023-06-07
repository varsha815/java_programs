package com.varsha.basic;
//To find Armstrong Number between two given number.
import java.util.Scanner;
//The program asks the user to enter the lower and upper limits for the range of numbers.
//        It then iterates through each number in the given range.
//        For each number, the isArmstrong() method is called to check if the number is an Armstrong number.
//        The isArmstrong() method calculates the sum of the digits raised to the power of the number of digits in the original number.
//        If the calculated sum is equal to the original number, it is an Armstrong number and is printed.

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are: ");
        for (int number = lower; number <= upper; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int length = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, length);
            number /= 10;
        }

        return originalNumber == result;
    }
}
