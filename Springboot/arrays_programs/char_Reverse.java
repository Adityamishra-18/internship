package com.arrays;
import java.util.Scanner;

public class char_Reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size:");
        int n=sc.nextInt();

        char []arr=new char[n];

        System.out.println("Enter the characters:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("In reverse order:");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
