package com.Recurssion;

public class PrintSum {
	public static int print(int no) {
		if(no==1) {
			return no;
		}else {
			return no+print(no-1);
		}
	}
public static void main(String[] args) {
	System.out.println(print(5)); 
}
}
