package com.Recurssion;

public class Print1_10 {
	public static void print(int no) {
		if(no<=10) {
			System.out.println(no);
			print(no+1);
		}
	}
public static void main(String[] args) {
	print(1);
}
}
