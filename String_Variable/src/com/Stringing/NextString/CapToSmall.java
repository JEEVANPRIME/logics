package com.Stringing.NextString;
import java.util.Scanner;
public class CapToSmall {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String str=scn.nextLine();
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		char ch1 = 0;
		if(ch>=65 && ch<=90) {
			ch1=((char)(ch+32));
		}else if(ch>=97 && ch<=122) {
			ch1=((char)(ch-32));
		}
		System.out.print(ch1);
	}
}
}
