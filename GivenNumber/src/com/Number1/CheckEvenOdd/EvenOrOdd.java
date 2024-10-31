package com.Number1.CheckEvenOdd;
import java.util.Scanner;
public class EvenOrOdd {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int no=scn.nextInt();
	EvenOrOdd e1=new EvenOrOdd();
	String i=e1.isCheck(no);
	System.out.println(i); 
}

String isCheck(int no) {
	int even=0;
	int odd=0;
	while(no!=0) {
		int rem=no%10;
		if(rem%2==0) {
			even=(even*10)+rem;
		}
		else {
			odd=(odd*10)+rem;
		}
		no=no/10;
	}
	return (even+""+odd);
} 
}
