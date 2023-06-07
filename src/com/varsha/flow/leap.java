package com.varsha.flow;
//Input a year and find whether it is a leap year or not.
//
//        A year is a leap year if the following conditions are satisfied:
//
//        The year is multiple of 400.
//        The year is multiple of 4 and not multiple of 100.

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if (year%4==0){
            if(year%100==0)
            {
                if(year%400==0){

                    System.out.println("leap");
                }
                else{
                    System.out.println("not leap");
                }
            }else
            {
                System.out.println("leap");
            }

        }
        else{
            System.out.println("not leap");
        }
    }

}
