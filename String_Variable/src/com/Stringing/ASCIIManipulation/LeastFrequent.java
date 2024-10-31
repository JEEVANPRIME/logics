package com.Stringing.ASCIIManipulation;
import java.util.Scanner;
public class LeastFrequent {

	void isLeast(String str) {
		int[] arr=new int[128];
		int count=10; 
		char MinChar='\0';
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			arr[ch]++;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(arr[ch]<count && arr[ch]>0) {
				count=arr[ch];
				MinChar=ch; 
			}
		} 
		if(MinChar != '\0') {
			System.out.println(MinChar+" "+count);
		}else {
			System.out.println("Not found");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		LeastFrequent l1=new LeastFrequent();
		l1.isLeast(str);
	}
}
