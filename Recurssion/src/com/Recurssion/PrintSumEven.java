package com.Recurssion;

public class PrintSumEven {

	public static int even(int no) {
		if(no==0) {
			return 0;
		}
		if(no%2==1) {
			return no+even(no-1); 
		}
		return even(no-1); 
	}

	public static void main(String[] args) {
		System.out.println(even(5));  
	}
}
