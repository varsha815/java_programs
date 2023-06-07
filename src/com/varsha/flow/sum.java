package com.varsha.flow;
import java.util.Scanner;
//Take two numbers and print the sum of both.

public class sum {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        sum.add(a,b);

    }
}
