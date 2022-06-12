package com.java8.functionalinterface.methodreference;

import com.java8.functionalinterface.FunctionalInterfaceWithMultipleArgs;

public class InstenceMethodRefrence {

	public int  add(int a, int b ,int c,int d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		InstenceMethodRefrence imr = new InstenceMethodRefrence();
		FunctionalInterfaceWithMultipleArgs<Integer,Integer,Integer,Integer,Integer> fin = imr::add;
		System.out.println(fin.add(2, 3,4, 5));
		
		
		FunctionalInterfaceWithMultipleArgs<Integer,Integer,Integer,Integer,Integer> finlamdaa = (a,b,c,d)->{return a+b+c+d;};
		System.out.println(finlamdaa.add(1, 2, 3, 4));
	}
}
