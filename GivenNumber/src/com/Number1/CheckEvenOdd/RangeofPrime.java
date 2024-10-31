package com.Number1.CheckEvenOdd;

public class RangeofPrime {

	public static void main(String[] args) {
		int range = 20;
		boolean[] arr = new boolean[range];
		for (int i = 2; i < range; i++) {
			arr[i] = true;
		}
		for (int i = 2; i * i < range; i++) {
			for (int j = i * i; j < range; j = j + i) {
				if (arr[j]) {
					arr[j] = false;
				}
			}
		}
		for (int i = 2; i < range; i++) {
			if (arr[i]) {
				System.out.println(i);
			}
		}
	}
}
