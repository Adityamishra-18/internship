package com.arrays;

public class secondLast_element {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++){
            if(i == arr.length-2){
                System.out.println("second last element of the array is :"+arr[i]);
            }
        }
    }
}
