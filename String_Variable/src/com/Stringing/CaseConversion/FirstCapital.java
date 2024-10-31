package com.Stringing.CaseConversion;
import java.util.Scanner;
public class FirstCapital {
	
	String FirstUpper(String str) {
		String result="";
		char[] ch=str.toCharArray();
		String n=str.toUpperCase().substring(0,1);
		for(int i=1;i<ch.length;i++) {
			result=result+ch[i];
		}
		return (n+result);  
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String[] str2=str.split(" ");
		FirstCapital f1=new FirstCapital();
		for(int i=0;i<str2.length;i++) {
		System.out.print(f1.FirstUpper(str2[i]+" "));  
		}
//		String result="";
//		char[] ch=str.toCharArray();
//		String n=str.toUpperCase().substring(0,1);
//		for(int i=1;i<ch.length;i++) {
//			result=result+ch[i];
//		}
//		System.out.print(n+result);  
		
	}

}
