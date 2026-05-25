package com.number_programs;
import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int org = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if (org == rev) {
            System.out.println(org + " is a Palindrome number");
        } else {
            System.out.println(org + " is not a Palindrome number");
        }

    }
}
