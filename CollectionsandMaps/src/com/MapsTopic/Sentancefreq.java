package com.MapsTopic;

import java.util.HashMap;
import java.util.Map;

public class Sentancefreq {

	public static void main(String[] args) {
		String str = "hi hi hello how how are you you";
		String[] s1 = str.split(" ");
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		for (String s : s1) {
			if (h1.containsKey(s)) {
				h1.put(s, h1.get(s) + 1);
			} else {
				h1.put(s, 1);
			}
		}
		for (Map.Entry<String, Integer> map : h1.entrySet()) {
//			String key = map.getKey();
//			Integer val = map.getValue();
			System.out.println(map.getKey()+" "+map.getValue()); 
			
		}
	}
}
