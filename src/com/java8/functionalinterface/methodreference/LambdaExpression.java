package com.java8.functionalinterface.methodreference;

import java.util.function.Consumer;

public class LambdaExpression {
	public static void main(String[] args) {
	
	Consumer<String> consumer = (name)->{System.out.println("Hello "+name);};
	consumer.accept("Anuj");

	}

}
