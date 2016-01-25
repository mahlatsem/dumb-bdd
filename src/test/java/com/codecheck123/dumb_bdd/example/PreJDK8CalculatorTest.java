package com.codecheck123.dumb_bdd.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codecheck123.dumb_bdd.Arguments;
import com.codecheck123.dumb_bdd.ExpressionRunner;
import com.codecheck123.dumb_bdd.UserStory;

public class PreJDK8CalculatorTest {
	private int result = 0;

	@Test
	public void addTwoNumbers() {
		final Calculator calculator = new Calculator();
		
		new UserStory("In order to avoid silly mistakes as a math idiot, "
				+ "I want to be told the sum of two numbers"
		)
		.given("I have entered '50' into the calculator", new ExpressionRunner() {
			public void expression(Arguments args) {
				calculator.enter(args.first().asInt());
			}
		})
		.and("I have entered '70' into the calculator", new ExpressionRunner() {
			public void expression(Arguments args) {
				calculator.enter(args.first().asInt());
			}
		})
		.when("I press '"+MathOperation.ADD+"'", new ExpressionRunner() {
			public void expression(Arguments args) {
				result = calculator.command(args.first().asString());
			}
		})
		.then("The result should be '120'", new ExpressionRunner() {
			public void expression(Arguments args) {
				assertEquals(args.first().asInt(), result);
			}
		});
	}
	
	
	@Test
	public void subtraction() {
		final Calculator calculator = new Calculator();
		
		new UserStory("In order to avoid silly mistakes as a math idiot, "
				+ "I want to be told the difference of two numbers"
		)
		.given("I have entered '50' into the calculator", new ExpressionRunner() {
			public void expression(Arguments args) {
				calculator.enter(args.first().asInt());
			}
		})
		.and("I have entered '70' into the calculator", new ExpressionRunner() {
			public void expression(Arguments args) {
				calculator.enter(args.first().asInt());
			}
		})
		.when("I press '"+MathOperation.MINUS+"'", new ExpressionRunner() {
			public void expression(Arguments args) {
				result = calculator.command(args.first().asString());
			}
		})
		.then("The result should be '20'", new ExpressionRunner() {
			public void expression(Arguments args) {
				assertEquals(args.first().asInt(), result);
			}
		});
	}
}
