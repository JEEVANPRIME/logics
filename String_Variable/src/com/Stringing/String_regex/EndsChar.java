package com.Stringing.String_regex;
import java.util.Scanner;
public class EndsChar {

	boolean isEnds(String str) {
		return str.endsWith("world");
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		EndsChar e1=new EndsChar();
		System.out.println(e1.isEnds(str));
	}
}
