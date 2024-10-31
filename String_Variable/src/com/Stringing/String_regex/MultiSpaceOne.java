package com.Stringing.String_regex;
import java.util.Scanner;
public class MultiSpaceOne {
	String isMulti(String str) {
//		return str.replaceAll("[ +]", " "); 
		return str.replaceAll(" +", " "); 
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		MultiSpaceOne m1=new MultiSpaceOne();
		System.out.println(m1.isMulti(str));
	}
}
