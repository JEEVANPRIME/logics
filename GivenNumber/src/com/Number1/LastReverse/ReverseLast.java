package com.Number1.LastReverse;
import java.util.Scanner;

public class ReverseLast {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int no=scn.nextInt();
	ReverseLast r1=new ReverseLast();
	String i=r1.isLast(no);
	System.out.println(i);
}


String isLast(int no) {
	int rem=no%1000;
	rem=isReverse(rem);
	no=no/1000;
	return (no+""+rem);
}


int isReverse(int no) {
	int result=0;
	while(no!=0){
		int rem=no%10;
		result=(result*10)+rem;
		no=no/10;
	}
	return result;
}
}
