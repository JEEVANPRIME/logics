package com.Stringing.String_regex;
import java.util.Scanner;
public class OnlyLetters {
	String isCheck(String str) {
		return str=str.replaceAll("[^a-zAz-z]", "");
	}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String str=scn.nextLine();
	OnlyLetters o1=new OnlyLetters();
	System.out.println(o1.isCheck(str));
}
}
