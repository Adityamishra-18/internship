package com.number_programs;

public class swapwithout_third {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Before Swapping the value of a = "+a+" and b = "+ b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping the value of a = "+a+" and b = "+ b);
    }
}
