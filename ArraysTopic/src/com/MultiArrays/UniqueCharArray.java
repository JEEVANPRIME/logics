package com.MultiArrays;

public class UniqueCharArray {
public static void main(String[] args) {
	String str="parameters";
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		boolean flag=true;
		for(int j=0;j<ch.length;j++) {
			if(i!=j && ch[i]==ch[j]) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.print(ch[i]);
		}
	}
}
}