package com.Stringing.String_regex;
import java.util.Scanner;
public class AllNumber {
	String isCheck(String str) {
		str=str.replaceAll("[a-zA-Z]", "");
		return str;
	}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String str=scn.nextLine();
	AllNumber o1=new AllNumber();
	System.out.println(o1.isCheck(str));
}
}