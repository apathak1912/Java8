package com.java8.interfaces;

interface alpha {
	default void reset() {
		System.out.println("This is alpha version of default");
	}
}

interface beta {
	default void reset() {
		System.out.println("This is beta version of default");
	}
}

public class Main implements alpha, beta {

	@Override
	public void reset() {
		alpha.super.reset();
		beta.super.reset();
	}

	public static void main(String[] args) {
		new Main().reset();
	}
}
