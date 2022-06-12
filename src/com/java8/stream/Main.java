package com.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		//Given a list of integers, find out all the even numbers exist in the list using Stream functions?
		//getAllEvenInteger();
		//Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		//findTheListNumberStartsWithInteger();
		
		//How to find duplicate elements in a given integers list in java using Stream functions?
		findTheDuplicatesInList();
		//Given the list of integers, find the first element of the list using Stream functions?
		//findTheFirstElement();
		//Given a list of integers, find the total number of elements present in the list using Stream functions?
		//findTheTotalNumberOfElements();
		//Given a String, find the first non-repeated character in it using Stream functions?
		//findThefirstNonReaptingCharacter();
	}

	private static void findThefirstNonReaptingCharacter() {
		String input = "Java Hungry Blog Alive is Awesome";

		 Character result = input.chars() // Stream of String       
                 .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue() == 1L)
                 .map(entry -> entry.getKey())
                 .findFirst()
                 .get();
System.out.println(result);   
		
	}

	private static void findTheTotalNumberOfElements() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,98,32);
		Integer count = (int) myList.stream().count();
		System.out.println(count);
		int max = myList.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Max :"+max);
		
		int min = myList.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("min :"+min);
	}

	private static void findTheFirstElement() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,98,32);
		 myList.stream().findFirst().ifPresent(System.err::println);
		
	}

	private static void findTheDuplicatesInList() {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,98,32);
		 myList.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(x->x.getValue() > 1)
				.forEach((x)->System.out.println("Elements : "+x.getKey()+" Numbers"+x.getValue()));
		
		 List<Integer> dub = myList.stream()
					.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
					.entrySet()
					.stream().filter(x->x.getValue()>1)
					.map(x->x.getKey())
					.collect(Collectors.toList());
					System.out.println(dub);
	}

	private static void findTheListNumberStartsWithInteger() {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		 myList.stream().map(x->x.toString()).filter(x->x.startsWith("1")).forEach(System.out::println);
		Stream<Object> m = myList.stream().map(x->x.toString());
		System.err.println(m.count());
		
	}

	private static void getAllEvenInteger() {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		 myList.stream().filter(x->x%2==0).forEach(System.out::println);
		//List<Integer> lin = myList.stream().filter(x->x%2==0).collect(Collectors.toList());
		//System.out.println(lin);
	}
}
