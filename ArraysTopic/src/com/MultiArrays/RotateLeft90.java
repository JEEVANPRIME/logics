package com.MultiArrays;

public class RotateLeft90 {
public static void main(String[] args) {
	int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	for(int row=arr.length-1;row>=0;row--) {
		for(int col=0;col<arr[row].length;col++) {
			System.out.print(arr[col][row]+" ");
		}
		System.out.println();
	}
}
}
