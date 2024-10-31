package com.Stringing.CaseConversion;
import java.util.Scanner;
public class VowelToUpper {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String result="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i); 
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.print((char)(ch-32)); 
			}else {
				System.out.print(ch); 
			}
				
		}
		
	}

}
