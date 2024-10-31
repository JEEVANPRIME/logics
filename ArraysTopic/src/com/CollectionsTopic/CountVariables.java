package com.CollectionsTopic;

import java.util.ArrayList;
import java.util.Collections;

public class CountVariables {
	static int maxPermutationCount(String[] str) {
		int count = 0;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i < str.length; i++) {
			String result = str[i];
			result = result.replaceAll("[aeiouAEIOU]", "");
			a1.add(isFact(result.length()));
		}
		Collections.sort(a1);
		count = a1.get(a1.size() - 1);
		return count;
	}

	static int isFact(int no) {
		int fact = 1;
		for (int i = no; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		String[] str = { "hello", "ccbc", "aaeiou" };
		System.out.println(maxPermutationCount(str));
	}
}

/*
 * program in an array return count if the number divisible by 7 if the number
 * greater than 77 and 0 return the count 0
 */