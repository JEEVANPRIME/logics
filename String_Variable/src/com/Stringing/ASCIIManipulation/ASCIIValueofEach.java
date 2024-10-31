package com.Stringing.ASCIIManipulation;

public class ASCIIValueofEach {

	public static void main(String[] args) {
		int[] arr=new int[127];
		for(int i=0;i<=arr.length;i++) {
			System.out.println(i+" "+(char)(i)); 
		} 
	}
}
