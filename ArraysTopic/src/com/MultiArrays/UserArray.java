package com.MultiArrays;

import java.util.Scanner;

public class UserArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rowsize = scn.nextInt();
		int colsize = scn.nextInt();
		int[][] arr = new int[rowsize][colsize];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = scn.nextInt();
			}
			System.out.println();
		}
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
