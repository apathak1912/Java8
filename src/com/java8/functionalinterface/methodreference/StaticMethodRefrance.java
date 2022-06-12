package com.java8.functionalinterface.methodreference;

import com.java8.functionalinterface.FunctionalInterfaceWithMultipleArgs;

public class StaticMethodRefrance {

	public static int  add(int a, int b ,int c,int d) {
		return a+b+c+d;
	}
	
public static void main(String[] args) {
		
		//Using Method Reference
		FunctionalInterfaceWithMultipleArgs<Integer,Integer,Integer,Integer,Integer> fin = StaticMethodRefrance::add;
		System.out.println("Static method reference :"+fin.add(2, 3, 4, 5));
		
		//Using Lambda Expression 
		FunctionalInterfaceWithMultipleArgs<Integer,Integer,Integer,Integer,Integer> finLambd = (a,b,c,d)->{return a+b+c+d;};
		System.out.println("Using Lambds Expression : "+finLambd.add(2, 3, 4, 5));
	}
}
