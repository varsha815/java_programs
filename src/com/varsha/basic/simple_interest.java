package com.varsha.basic;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//Simple interest is a quick method of calculating the interest charge on a loan. Simple interest is determined by multiplying the daily interest rate by the principal by the number of days that elapse between payments.
//
//        Simple interest formula is given by:
//
//        Simple Interest = (P x T x R)/100
//        Where,
//
//        P is the principal amount
//        T is the time and
//        R is the rate

public class simple_interest {
    public static void main(String[] args) {
        // We can change values here for
        // different inputs
        float P = 1, R = 1, T = 1;

        /* Calculate simple interest */
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}
