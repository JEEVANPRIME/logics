package com.MultiArrays;

public class Rotate180 {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int col=arr.length-1;col>=0;col--) {
			for(int row=arr[col].length-1;row>=0;row--) { 
				System.out.print(arr[col][row]+" ");
			}
			System.out.println(); 
		}
	}
}
