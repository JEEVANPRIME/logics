package com.BubbleSorting;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 1, 2 };
		int no = 3;
		linearSearch(arr, no);
	}

	static void linearSearch(int[] arr, int searchValue) {
		if (searchValue < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == searchValue) {
					System.out.println("Index value present in: " + i);
//					return;
				}
			}
		} else {
			System.out.println("Value not found");
		}
	}

}
