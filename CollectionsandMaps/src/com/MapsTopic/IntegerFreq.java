package com.MapsTopic;

import java.util.HashMap;
import java.util.Map;

public class IntegerFreq {

	public static void main(String[] args) {
		int[] no={11,22,11,22,23,34,43,43,34};
		HashMap<Integer, Integer> h1=new HashMap<Integer, Integer>();
		for (int i : no) {
			if(h1.containsKey(i)) {
				h1.put(i, h1.get(i)+1);
			}
			else {
				h1.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> n : h1.entrySet()) {
			Integer key = n.getKey();
			Integer val = n.getValue();
			System.out.println(key+" "+val);
			
		}
	}
}
