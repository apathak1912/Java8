package com.java8.optional;

import java.util.Optional;

public class OrElse {
	public static void main(String[] args) throws IllegalAccessException {
		String nullValue = null;
		String optional = Optional.ofNullable(nullValue).orElse("Anuj");
		System.out.println(optional);
		String optional2 = Optional.ofNullable(nullValue).orElseGet(()->"Anuj kumar");
		System.out.println(optional2);
		String optional3 = Optional.ofNullable(nullValue).orElseThrow(IllegalAccessException ::new);
		System.out.println(optional3);
	}
}
