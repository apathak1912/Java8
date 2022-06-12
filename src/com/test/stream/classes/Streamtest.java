package com.test.stream.classes;

import java.util.Arrays;
import java.util.List;

public class Streamtest {
	
	public static void main(String[] args) {
		findTheTotalNumberOfElements();
	}

	private static void findTheTotalNumberOfElements() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,98,32);
		Integer count = (int) myList.stream().count();
		System.out.println(count);
		int max = myList.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(max);
		int min = myList.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(min);
	}
}
