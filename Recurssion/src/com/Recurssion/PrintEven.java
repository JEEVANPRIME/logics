package com.Recurssion;

public class PrintEven {
	public static void print(int no) {
		if (no <= 10) {
			if (no % 2 == 0) {
				System.out.println(no); 
			}
			print(no + 1);
		}
	}

	public static void main(String[] args) {
		print(1);
	}
}
