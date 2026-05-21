package com.internship;

public class swapwithout_third {
	public static void main(String[] args) {
		 int a = 3;
	     int b = 5;

	     System.out.println("Before Swapping the value of a = "+a+" and b = "+ b);

	     a = a + b;
	     b = a - b;
	     a = a - b;

	     System.out.println("After Swapping the value of a = "+a+" and b = "+ b);
	}

}
