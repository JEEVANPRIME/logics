package com.MultiArrays;

public class SumofDiagonalDiff {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int col = arr.length - 1;
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
//			for(int col=arr[row].length-1;col>=0;col--) {
			sum += arr[row][col];
			col--;
//			}
		}
		System.out.println(sum);
	}
}
