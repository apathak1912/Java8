package com.java8.functionalinterface.methodreference;

import com.java8.functionalinterface.CunstructorMethodRefInterface;

public class ConstructoMethodReference {

	public static void main(String[] args) {
		CunstructorMethodRefInterface cmri = ConstructoMethodReference ::new;
		cmri.getConstructoMethodReference().sayHello();
	}
	
	public void sayHello() {
		System.out.println("hogelau re ");
	}
}
