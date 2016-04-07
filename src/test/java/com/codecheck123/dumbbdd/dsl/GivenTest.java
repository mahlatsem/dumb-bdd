package com.codecheck123.dumbbdd.dsl;

import static org.junit.Assert.*;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import com.codecheck123.dumbbdd.dsl.Arguments;
import com.codecheck123.dumbbdd.dsl.ExpressionRunner;
import com.codecheck123.dumbbdd.dsl.Given;
import com.codecheck123.dumbbdd.dsl.Scenario;
import com.codecheck123.dumbbdd.dsl.UserStory;

public class GivenTest {
	private UserStory userStory = new UserStory.WithTitle("Given Tests")
			.asA("Developer")
			.iCan("Write tests using bdd format")
			.create();

	@Test
	public void getUserStoryScenario() {
		Scenario scenario = new Scenario(userStory, "Get a Scenario");
		Given given = new Given(scenario, "Some given input expression", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
		assertNotNull(given.getScenario());
	}

	@Test
	public void getAllGivenInputs() {
		Scenario scenario = new Scenario(userStory, "Get all Given inputs");
		Given given = new Given(scenario, "1st given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		})
		.and("2nd given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
		
		assertThat(given.getAllGiven().size()).isEqualTo(2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void andInputIsNull() {
		Scenario scenario = new Scenario(userStory, "And input is Null");
		new Given(scenario, "1st given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		})
		.and(null, new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void andInputIsEmpty() {
		Scenario scenario = new Scenario(userStory, "And input is Empty");
		new Given(scenario, "1st given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		})
		.and("", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
	}

	@Test(expected=IllegalArgumentException.class)
	public void whenExpressionIsNull() {
		Scenario scenario = new Scenario(userStory, "when() expression Is Null");
		Given given = new Given(scenario, "1st given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
		
		String when = null;
		given.when(when, new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void whenExpressionIsEmpty() {
		Scenario scenario = new Scenario(userStory, "when() expression Is Emptyl");
		Given given = new Given(scenario, "1st given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
		
		String when = "";
		given.when(when, new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
	}
	
	@Test
	public void whenNotThrowingException() {
		Scenario scenario = new Scenario(userStory, "when() is not throwing exception");
		Given given = new Given(scenario, "1st given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
		
		assertNotNull(given.when("when", new ExpressionRunner() {
			public void expression(Arguments args) {}
		}));
	}

}
