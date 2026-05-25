package com.arrays;

public class sum_evenidx_oddidx {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6};

        int evenidxsum=0;
        int oddidxsum=0;

        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0){
                evenidxsum = evenidxsum+arr[i];
            }else{
                oddidxsum = oddidxsum+arr[i];
            }
        }
        System.out.println("Sum of evenindex values are ="+evenidxsum);
        System.out.println("Sum of oddindex values are ="+oddidxsum);
    }
}
