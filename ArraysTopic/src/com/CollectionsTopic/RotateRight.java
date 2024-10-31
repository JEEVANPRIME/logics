package com.CollectionsTopic;
import java.util.Scanner;
public class RotateRight {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5};
		int k = scn.nextInt();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		} 
		if (k > arr.length) {
			k = k % arr.length;
			System.out.println("");
			for (int i = 0; i < arr.length; i++) {
				if (i < k) {
					System.out.print(arr[arr.length + i - k] + " "); 
				} else {
					System.out.print(arr[i - k] + " ");
				}
			}
		} else { 
			System.out.println("");
			for (int i = 0; i < arr.length; i++) {
				if (i < k) {
					System.out.print(arr[arr.length + i - k] + " ");
				} else {
					System.out.print(arr[i - k] + " "); 
				} 
			}
		}

		System.out.println("");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}
}
