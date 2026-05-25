package com.number_programs;
import java.util.Scanner;

public class check_amstrong {
    static int count = 0;
    static int power(int rem){
        int mul=1;
        for(int i=0;i<count;i++){
            mul = mul*rem;
        }
        return mul;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();

        int sum=0;
        int arm=num;
        while(num != 0){
            num=num/10;
            count++;
        }
        num= arm;
        while(num !=0){

            int remainder=num % 10;
            sum=sum + power(remainder);
            num=num/10;
        }
        if(sum == arm){
            System.out.println(sum+" is amstrong number");
        }else{
            System.out.println(sum +" is not amstrong number");
        }

    }
}

