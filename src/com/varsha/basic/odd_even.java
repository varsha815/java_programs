package com.varsha.basic;
import java.util.Scanner;
//https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/
//Write a program to print whether a number is even or odd, also take input from the user.
//There are various ways to check whether the given number is odd or even. Some of them are as follows starting from the brute force approach ending up at the most optimal approach.
//
//        Using Brute Force- Naive Approach
//        Using bitwise operators
//        Using Bitwise OR
//        Using Bitwise AND
//        Using Bitwise XOR
//        By Checking the Least Significant Bit

public class odd_even {
    public static void main(String[] args) {
//        Method 1: Brute Force Naive Approach
//
//        It is to check the remainder after dividing by 2. Numbers that are divisible by 2 are even else odd.

        // Declaring and initializing integer variable
        int num = 10;

        // Checking if number is even or odd number
        // via remainder
        if (num % 2 == 0) {

            // If remainder is zero then this number is even
            System.out.println("Entered Number is Even");
        }

        else {

            // If remainder is not zero then this number is
            // odd
            System.out.println("Entered Number is Odd");
        }

    }
}


