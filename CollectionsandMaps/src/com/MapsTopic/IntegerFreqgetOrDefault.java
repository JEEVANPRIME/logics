package com.MapsTopic;

import java.util.HashMap;
import java.util.Map;

public class IntegerFreqgetOrDefault {

	public static void main(String[] args) {
		int[] no = {10,11,12,11,13,14,12,13,14};
		HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		for (int i : no) {
			h1.put(i, h1.getOrDefault(i, 0)+1);
		}
		for (Map.Entry<Integer, Integer> map : h1.entrySet()) {
//			String key = map.getKey();
//			Integer val = map.getValue(); 
			System.out.println(map.getKey() + " " + map.getValue());

		}
	}
}
