package com.value.Number;

import java.util.Scanner;

class Prime{
	int count=0;
	public int countPrimes(int r) {
		for(int j=2;j<=r;j++) {
			int no=j;
			boolean flag=true;
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.print(no+" ");
				count++;
			}
		}
		System.out.println();
		return count;
	}
}

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		Prime p1=new Prime();
		System.out.println(p1.countPrimes(no));
	}
}
