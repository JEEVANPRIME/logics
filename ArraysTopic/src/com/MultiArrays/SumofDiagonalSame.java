package com.MultiArrays;

public class SumofDiagonalSame {
public static void main(String[] args) {
	int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	int sum=0;
	for(int row=0;row<arr.length;row++) {
		if(arr[row]==arr[row]) {
			sum+=arr[row][row];
		}
	}
	System.out.println(sum);
}
}