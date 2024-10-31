package com.Stringing.ASCIIManipulation;
import java.util.Scanner;
public class CountSplChar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[128];
		int count=0;
		String str=scn.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!((ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch<=122))){
				count++; 
			}
		}
		System.out.println(count);
	}
}
