package com.codecheck123.dumbbdd.dsl;

public class Util {
	private Util(){}

	static void checkForNotNullOrEmpty(String expression) {
		if(expression == null || expression.isEmpty()){
			throw new IllegalArgumentException("Expression may not be NULL or Empty");
		}
	}
}
