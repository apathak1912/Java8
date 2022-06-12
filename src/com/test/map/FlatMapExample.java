package com.test.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList<Student> l1 = new ArrayList<>();
		Student s1 = Student.builder().id(1).Name("Anuj").build();
		Student s2 = Student.builder().id(2).Name("Anuj2").build();
		Student s3 = Student.builder().id(3).Name("Amit").build();
		Student s4 = Student.builder().id(5).Name("Ritu").build();
		l1.add(s1);l1.add(s2);l1.add(s3);l1.add(s4);
		ArrayList<Student> l2 = new ArrayList<>();
		Student s21 = Student.builder().id(1).Name("Sachin").build();
		Student s22 = Student.builder().id(2).Name("Jinu").build();
		Student s23 = Student.builder().id(3).Name("Vishhal").build();
		Student s24 = Student.builder().id(5).Name("Vishesh").build();
		l2.add(s21);l2.add(s22);l2.add(s23);l2.add(s24);
		
		List<ArrayList> all = new ArrayList<>();
		all.add(l1);all.add(l2);
		System.err.println(all);
		List<Student> students = (List<Student>) all.stream()
				.flatMap(a ->a.stream())
				.collect(Collectors.toList());
		System.out.println(students);
		
	}

}
