package com.test.oreach;

import java.util.Map;
import java.util.TreeMap;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new TreeMap();
		map.put("K1", "one");
		map.put("K2", "two");
		map.put("K3", "three");
		
		map.forEach((k,v)->System.out.println("key->"+k+" "+"value "+v));
	}

}
