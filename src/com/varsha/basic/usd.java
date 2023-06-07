package com.varsha.basic;
import java.util.Scanner;
//Input currency in rupees and output in USD.

public class usd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in Indian Rupees (INR): ");
        double inr = scanner.nextDouble();

        // Assuming the fixed exchange rate of 1 INR = 0.014 USD
        double exchangeRate = 0.014;
        double usd = inr * exchangeRate;

        System.out.println("Equivalent amount in US Dollars (USD): " + usd);
    }
}
