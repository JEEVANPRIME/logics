package com.Stringing.ASCIIManipulation;
import java.util.Scanner;
public class MostFrequent {
	static int[] arr=new int[128];
	
	void isMax(String str) {
		int count=0;
		char MaxChar=str.charAt(0);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			arr[ch]++;
			
			if(arr[ch]>count) {
				count=arr[ch];
				MaxChar=ch;
			}
		}
		System.out.println(MaxChar+" "+count); 
	}
	
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		
		MostFrequent m1=new MostFrequent();
		m1.isMax(str);
		
	}
}
