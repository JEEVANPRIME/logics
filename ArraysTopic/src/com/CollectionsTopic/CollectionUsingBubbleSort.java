package com.CollectionsTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class CollectionUsingBubbleSort {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>(Arrays.asList(4,1,3,5,2));
		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
			for (int j = 0; j < l1.size()-1-i; j++) {
				if(l1.get(j)>l1.get(j+1)) {
					int temp=l1.get(j);
					l1.set(j, l1.get(j+1));
					l1.set(j+1, temp);
				}
			}
		}
		System.out.println(l1);
	}
}
