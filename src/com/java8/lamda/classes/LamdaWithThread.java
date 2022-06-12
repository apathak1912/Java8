package com.java8.lamda.classes;

import com.test.lamda.interfaces.MethodRefInterface;

public class LamdaWithThread  {
	
	
	public static void main(String[] args) {
		Thread l = new Thread(()-> {System.out.println("hello");});
		l.start();
		
		
	}

}
