package com.CollectionsTopic;

import java.util.Scanner;

public class RotateLeft {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();
		int[] arr = { 1, 2, 3, 4, 5 };
		if (k > arr.length) {
			k = k % arr.length;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[(i - k + arr.length) % arr.length] + " ");
		}
	}
}
