package com.number_programs;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int a=0;
        int b=1;
        int c;

        if (num <0){
            System.out.println(0);
        }
        if (num == 1){
            System.out.println(0);
        }

        for(int i=0;i<num;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
