package com.Stringing.String_regex;
import java.util.Scanner;
public class VowelSpeficChar {
	
	String isVowel(String str) {
		return str.replaceAll("[aeiou]", "?");
	}
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		VowelSpeficChar v1=new VowelSpeficChar();
		System.out.println(v1.isVowel(str));
	}
}
