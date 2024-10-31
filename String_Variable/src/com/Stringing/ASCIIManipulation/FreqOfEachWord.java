package com.Stringing.ASCIIManipulation;
import java.util.Scanner;
public class FreqOfEachWord {
	static int[] arr=new int[128];
	
	void isFreq(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) { 
				System.out.println((char)i+" "+arr[i]);
			}
		}
	} 
	
	public static void main(String[] args) {
		FreqOfEachWord f1=new FreqOfEachWord();
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		f1.isFreq(str);
		
		
		
		
//		System.out.println(f1.isFreq(str));
//		int[] arr=new int[128];
//		
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			arr[ch]++;
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>0) {
//				System.out.println((char)i+" "+arr[i]);
//			}
//		}
	}
}
