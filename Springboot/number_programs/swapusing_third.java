package com.number_programs;

public class swapusing_third {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Before Swapping the value of a = "+a+" and b = "+ b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping the value of a = "+a+" and b = "+ b);
    }
}
