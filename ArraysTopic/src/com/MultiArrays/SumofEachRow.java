package com.MultiArrays;

import java.util.Scanner;

public class SumofEachRow {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] arr = { { 4, 3, 8 }, { 7, 1, 9 }, { 5, 3, 6 } };
		int maxi = 0;
		int mini = Integer.MAX_VALUE;
		for (int row = 0; row < arr.length; row++) {
			int sum = 0;
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
			}
			if (sum > maxi) {
				maxi = sum;
			}
			if (sum < mini) {
				mini = sum;
			}
		}
		System.out.println("Max is " + maxi);
		System.out.println("Min is " + mini);
	}
}
