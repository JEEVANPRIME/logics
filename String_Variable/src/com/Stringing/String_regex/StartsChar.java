package com.Stringing.String_regex;
import java.util.Scanner;
public class StartsChar {
	

	boolean isStart(String str) {
		return str.startsWith("Hello"); 
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		StartsChar c1=new StartsChar();
		System.out.println(c1.isStart(str));
	}
}
