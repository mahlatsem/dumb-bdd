package com.codecheck123.dumb_bdd.example;

import com.codecheck123.dumb_bdd.UserStory;

public class CalculatorTest {

	//@Test
	public void addTwoNumbers() {
		Calculator calculator = new Calculator();
		
		new UserStory("In order to avoid silly mistakes as a math idiot, "
				+ "I want to be told the sum of two numbers"
		)
		.given("I have entered '50' into the calculator", (args) -> {
			calculator.enter(args.first().asInt());
		})
		.and("I have entered '70' into the calculator", (args) -> {
			calculator.enter(args.first().asInt());
		})
		.when("I press 'add'", (args) -> {
			calculator.command(args.first().asString());
		})
		.then("The result should be '120'", (args) -> {
			//assertion goes here
		});
	}
}
