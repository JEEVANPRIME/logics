package com.Stringing.String_regex;
import java.util.Scanner;
public class CountWords {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
//		int count=str.length();
//		System.out.println(count);
		String[] str1=str.split(" ");
		System.out.println(str1);
	} 

}
