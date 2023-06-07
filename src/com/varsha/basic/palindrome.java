package com.varsha.basic;
import java.util.Scanner;
//To find out whether the given String is Palindrome or not.
//https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/
//reverse
//pointers


public class palindrome {
        public static void main(String[] args) {
            String str = "abcba";
            System.out.println(isPalindrome(str));
        }

        static boolean isPalindrome(String str) {
            if (str == null || str.length() == 0) {
                return true;
            }
            str = str.toLowerCase();
            for (int i = 0; i <= str.length() / 2; i++) {
                char start = str.charAt(i);
                char end = str.charAt(str.length() - 1 - i);

                if (start != end) {
                    return false;
                }
            }
            return true;
        }
    }

