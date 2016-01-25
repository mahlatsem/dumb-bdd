package com.codecheck123.dumb_bdd.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	List<Integer> numbers = new ArrayList<Integer>();

	public void enter(int number) {
		numbers.add(number);
	}

	public int command(String cmd) {
		int result = 0;
		switch(MathOperation.valueOf(cmd)){
		case ADD:
			for(Integer number : numbers){
				result += number;
			}
			break;
		case MINUS:
			result = numbers.get(0);
			for (int i = 1; i < numbers.size(); i++) {
				result -= numbers.get(i);
			}
			break;
		}
		
		return Math.abs(result);
	}

}
