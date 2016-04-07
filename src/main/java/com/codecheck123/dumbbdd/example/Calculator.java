package com.codecheck123.dumbbdd.example;

public class Calculator {
	private int result = 0;

	public int add(int input) {
		result += input;
		return result;
	}

	public int minus(int input) {
		result -= input;
		return result;
	}

	public int multiply(int input) {
		result *= input;
		return result;
	}

	public int divide(int input) {
		result /= input;
		return result;
	}

	public int getResults() {
		return result;
	}

	public void reset() {
		result = 0;
	}
}
