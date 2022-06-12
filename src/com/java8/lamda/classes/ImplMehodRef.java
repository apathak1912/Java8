package com.java8.lamda.classes;

import com.test.lamda.interfaces.MethodRefInterface;

public class ImplMehodRef {
	
	ImplMehodRef(){
		System.out.println("cunstructor ref..");
	}
	public static void test() {
		System.out.println("hello ...");
	}
	
	public  void test1() {
		System.out.println("hello ...non static");
	}
	public static void main(String[] args) {
		//Thread l = new Thread(LamdaWithThread::test); Method reference
		//l.start();
		//static method
		MethodRefInterface mi = ImplMehodRef::test;
		mi.sayHello();
		
		//non static method
		MethodRefInterface mi2 = new ImplMehodRef()::test1;
		mi2.sayHello();
		
		//Cunstuctor ref
		MethodRefInterface cuns = ImplMehodRef::new;
		cuns.sayHello();
		
	}

}
