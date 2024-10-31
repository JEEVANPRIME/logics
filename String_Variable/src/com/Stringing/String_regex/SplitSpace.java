package com.Stringing.String_regex;

import java.util.Scanner;

public class SplitSpace {

//	String isSplit(String str) {
//		return String str=str.split(" ");
//	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String[] str2=str.split(" ");
		for(int i=0;i<str2.length;i++) {
			System.out.println(str2[i]); 
		}
//		
////		System.out.println(str2);
////		SplitSpace s1=new SplitSpace();
//		//System.out.println(s1.isSplit(str));
		
		
		}
		
	}
 

