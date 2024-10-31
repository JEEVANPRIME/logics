package com.Stringing.NextString;
import java.util.Scanner;
public class StringNext {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int n=scn.nextInt();
		for(int i=0;i<=str.length()-1;i++) {
			String result="";
			result=result+(char)(str.charAt(i)+n);
			System.out.print(result);
			
		}
	}

}
