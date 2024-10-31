package com.Stringing.String_regex;
import java.util.Scanner;
public class SpaceToSplChar {
	String isSpl(String str) {
		return str.replaceAll("[ ]", "!");
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		SpaceToSplChar s1=new SpaceToSplChar();
		System.out.println(s1.isSpl(str));
	}
}
