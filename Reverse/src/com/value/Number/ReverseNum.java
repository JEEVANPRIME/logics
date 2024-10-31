package com.value.Number;
import java.util.Scanner;
class Solution{
	public int reverse(int x) {
		long result=0;
		
		while(x!=0) {
			int rem=x%10;
			result=(result*10)+rem;
			x=x/10; 
		}
		if(result<Integer.MIN_VALUE || result>Integer.MAX_VALUE) {
		return 0;  
		}
		else { 
			return (int)result;  
		}
	} 
}

public class ReverseNum {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int no=scn.nextInt();
		Solution s1=new Solution();
		System.out.println(s1.reverse(no));
	}

}
