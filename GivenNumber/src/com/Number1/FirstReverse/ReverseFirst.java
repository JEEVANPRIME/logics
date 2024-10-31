package com.Number1.FirstReverse;
import java.util.Scanner;
public class ReverseFirst {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int no=scn.nextInt();
	ReverseFirst r1=new ReverseFirst();
	String i=r1.isFirst(no);
	System.out.println(i);
}


String isFirst(int no) {
	int rem=no%1000;
	no=no/1000; 
	no=isReverse(no);
	return (no+""+rem); 
}


int isReverse(int no) {
	int result=0;
	while(no!=0) {
		int rem=no%10;
		result=(result*10)+rem;
		no=no/10;
	}
	return result;
}
}
