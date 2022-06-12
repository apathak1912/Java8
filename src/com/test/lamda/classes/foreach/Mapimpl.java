package com.test.lamda.classes.foreach;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Mapimpl {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1,"one");
		tm.put(2,"two");
		tm.put(3,"Three");
		tm.put(4,"Four");
		tm.put(5,"Five");
		
		//tm.forEach( (Key ,value) -> System.out.println("Key is "+Key+" value is :"+value) );
		tm.forEach( (Key1 ,value) -> System.out.println("Key is "+Key1+" value is :"+value) );
	
		String ar[] = {"Anuj","kumar","pathak"};
		for(String a :ar) {
			System.out.println(a);
		}
	}

}
