package com.StringNext;

public class SubString {
	public static void main(String[] args) {
		String str = "java is programming language";
		String[] s1 = str.split(" ");
		for (int i = 0; i < s1.length; i++) {
			isReverse(s1[i]);
		}
	}
	static void isReverse(String str) {
		char ch=str.charAt(0);
		String s1=str.substring(str.length()-1);
		String s2=str.substring(1, str.length()-1);
		System.out.println(s1+s2+ch);
	}
}
