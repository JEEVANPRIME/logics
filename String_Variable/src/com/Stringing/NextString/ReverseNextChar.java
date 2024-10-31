package com.Stringing.NextString;
import java.util.Scanner;
public class ReverseNextChar {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String str=scn.nextLine();
	String str1=isReverse(str);
	for(int i=0;i<str1.length();i++) {
		char ch=str1.charAt(i);
		System.out.print((char)(ch+1));  
	}
}

static String isReverse(String str) {
	String result="";
	for(int i=0;i<str.length();i++) {
		result=result+str.charAt(i);
	}
	return result;
}
}
