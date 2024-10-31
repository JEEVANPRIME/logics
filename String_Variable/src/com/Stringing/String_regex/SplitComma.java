package com.Stringing.String_regex;
import java.util.Scanner;
public class SplitComma {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String[] str2=str.split(",");
		for(int i=0;i<str2.length;i++) {
			System.out.println(str2[i]);
		}
	}

}
