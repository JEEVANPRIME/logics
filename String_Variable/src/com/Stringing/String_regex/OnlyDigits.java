package com.Stringing.String_regex;
import java.util.Scanner;
public class OnlyDigits {
	String isCheck(String str) {
		str=str.replaceAll("[a-zA-Z]", "");
		return str;
	}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String str=scn.nextLine();
	OnlyDigits o1=new OnlyDigits();
	System.out.println(o1.isCheck(str));
}
}
