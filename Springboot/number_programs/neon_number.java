package com.number_programs;
import java.util.Scanner;

public class neon_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();

        int square =num * num;
        int sum = 0;

        while(square > 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if(num == sum) {
            System.out.println(num+" is a Neon number");
        }
        else {
            System.out.println(num+" is not a Neon number");
        }

    }
}
