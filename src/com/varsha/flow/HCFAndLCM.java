package com.varsha.flow;
import java.util.Scanner;
//Take 2 numbers as inputs and find their HCF and LCM.
//1. Start
//        2. Read the first number (num1)
//        3. Read the second number (num2)
//        4. Calculate the HCF using the calculateHCF() method
//        4.1 Set a variable "temp" to num2
//        4.2 Set num2 to num1 modulo num2
//        4.3 Set num1 to "temp"
//        4.4 Repeat steps 4.1 to 4.3 until num2 is not equal to 0
//        4.5 Return num1 (HCF)
//        5. Calculate the LCM using the calculateLCM() method
//        5.1 Calculate the product of num1 and num2
//        5.2 Divide the product by the HCF obtained in step 4
//        5.3 Return the result (LCM)
//        6. Print the HCF and LCM values
//        7. End

        public class HCFAndLCM {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                int hcf = calculateHCF(num1, num2);
                int lcm = calculateLCM(num1, num2, hcf);

                System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
                System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
            }

            // Method to calculate the HCF using Euclidean algorithm
            public static int calculateHCF(int num1, int num2) {
                while (num2 != 0) {
                    int temp = num2;
                    num2 = num1 % num2;
                    num1 = temp;
                }
                return num1;
            }

            // Method to calculate the LCM using the formula: LCM = (num1 * num2) / HCF
            public static int calculateLCM(int num1, int num2, int hcf) {
                return (num1 * num2) / hcf;
            }
        }

