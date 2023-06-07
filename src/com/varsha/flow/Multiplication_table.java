package com.varsha.flow;
import java.util.Scanner;
//Take a number as input and print the multiplication table for it.

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);

        }
    }
}
