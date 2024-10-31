package com.Stringing.CaseConversion;
import java.util.Scanner;
public class VowelToLower {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				System.out.print((char)(ch+32));
			}else { 
				System.out.print(ch);
			}
		}
	}
}
