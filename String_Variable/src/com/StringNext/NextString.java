package com.StringNext;

public class NextString {
	public static void main(String[] args) {
		String str="aBjLZAz";
		String result="";
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				char shifted=(char)(ch+1);
				if(shifted>'z') {
					shifted='A';
				}
				result=result+shifted;
			}
			else if(ch>='A' && ch<='Z') {
				char shifted=(char)(ch+1);
				if(shifted>'Z') {
					shifted='a';
				} 
				result=result+shifted;
			}
		}
		System.out.println(result);
	}
}
