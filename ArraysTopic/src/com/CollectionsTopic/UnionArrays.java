package com.CollectionsTopic;

public class UnionArrays {
public static void main(String[] args) {
	int[] a1= {1,2,3,4,5};
	int[] a2= {6,7,8,9,0};
	int[] temp=new int[a1.length+a2.length];
//	System.arraycopy(a1, 0, temp, 0, a1.length);
//	System.arraycopy(a2, 0, temp, a1.length, a2.length);
	int j=0;
	for(int i=0;i<a1.length;i++) {
		temp[j++]=a1[i];
	}
	for(int i=0;i<a2.length;i++) {
		temp[j++]=a2[i];
	}
	for (int i = 0; i < temp.length; i++) {
		System.out.print(temp[i]+" ");
	}
}
}
