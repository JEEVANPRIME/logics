package com.Recurssion;

public class Print10_1 {
	public static void print(int no) {
		if(no>=1) {
			System.out.println(no);
			print(no-1);
		}
	}
public static void main(String[] args) {
	print(10);
}
}
