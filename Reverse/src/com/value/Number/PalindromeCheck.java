package com.value.Number;
import java.util.Scanner;
class Palimdrome{
	public boolean isPrime(int x) {
		int result=0;
		int no=x;
		if(x>0) {
		while(x!=0) {
			int rem=x%10;
			result=(result*10)+rem;
			x=x/10;
			}
		}
		else {
			return false;
		}
//		return result;
		if(no==result) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		Palimdrome p1=new Palimdrome();
		System.out.println(p1.isPrime(no));
	}
}
