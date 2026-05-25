package com.number_programs;

public class find_largest {
    public static void main(String[]args){
        int a=10;
        int b=12;
        int c=14;

        if(a>b && a>c){
            System.out.println(a+" is the largest number");
        } else if (b > a && b > c){
            System.out.println(b+" is the largest number");
        }else{
            System.out.println(c+" is the largest number");
        }
    }
}
