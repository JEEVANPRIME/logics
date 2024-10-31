package com.Number1.LastSum;

public class PerfectNum {

	public static void main(String[] args) {
		int no = 28;
		int copy = no;
		int sum = 0;
		for (int i = 1; i <= no / 2; i++) {
			if (no % i == 0) {
				sum += i; 
			}
		}
		if (sum == no) { 
			System.out.println("Perfect number");
		} else {
			System.out.println("Not perfect Number");
		}
	}
}
