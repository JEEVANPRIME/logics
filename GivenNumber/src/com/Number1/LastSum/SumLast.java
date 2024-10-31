package com.Number1.LastSum;
import java.util.Scanner;
public class SumLast {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int no=scn.nextInt();
	SumLast s1=new SumLast();
	String i=s1.isDoing(no); 
	System.out.println(i);  
	}

String isDoing(int no) { 
	int rem=no%1000;
	int i=isAdd(rem);
	no=no/1000;
	return (no+""+i); 
}

int isAdd(int no) {
	int sum=0;
	while(no!=0) {
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}
}
