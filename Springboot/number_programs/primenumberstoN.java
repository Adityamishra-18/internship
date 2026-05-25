package com.number_programs;
import java.util.Scanner;

public class primenumberstoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");

        for(int num = 1; num <= n; num++) {
            int count = 0;
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println(num);
            }
        }

    }
}
