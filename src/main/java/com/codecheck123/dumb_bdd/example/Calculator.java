package com.codecheck123.dumb_bdd.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	List<Integer> numbers = new ArrayList<>();

	public void enter(int number) {
		numbers.add(number);
	}

	public int command(String cmd) {
		int result = 0;
		switch(cmd){
		case "add":
			for(Integer number : numbers){
				result += number;
			}
			break;
		case "minus":
			result = numbers.get(0);
			for (int i = 1; i < numbers.size(); i++) {
				result -= numbers.get(i);
			}
			break;
		}
		
		return Math.abs(result);
	}

}
