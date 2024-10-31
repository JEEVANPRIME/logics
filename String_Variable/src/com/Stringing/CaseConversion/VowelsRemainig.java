package com.Stringing.CaseConversion;

import java.util.Arrays;

public class VowelsRemainig {

	public static void main(String[] args) {
		String vowel="aeiou";
		String str="Abstemious Education Facetious Aerious System Presented";
		str=str.toLowerCase();
		String[] s1=str.split(" ");
		for(int i=0;i<s1.length;i++) {
			String res=s1[i];
			String copy=res;
			res=res.replaceAll("[aeiou]", "");
			Arrays.sort(res);
			if(Arrays.equals(res, vowel)) {
			System.out.println(copy);
			}
		}
	}
}
