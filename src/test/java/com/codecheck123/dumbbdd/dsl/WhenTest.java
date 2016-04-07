package com.codecheck123.dumbbdd.dsl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.codecheck123.dumbbdd.dsl.Arguments;
import com.codecheck123.dumbbdd.dsl.ExpressionRunner;
import com.codecheck123.dumbbdd.dsl.Given;
import com.codecheck123.dumbbdd.dsl.Scenario;
import com.codecheck123.dumbbdd.dsl.UserStory;
import com.codecheck123.dumbbdd.dsl.When;

public class WhenTest {

	@Test(expected=IllegalArgumentException.class)
	public void givenIsNull() {
		new When(null, "when expression");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void bddExpressionIsNull() {
		new When(mock(Given.class), null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void bddExpressionIsEmpty() {
		new When(mock(Given.class), "");
	}
	
	@Test(expected=AssertionError.class)
	public void assertInExpressionFails() {
		new When(getDummyGiven(), "bddExpression")
		.then("then expression", new ExpressionRunner() {
			public void expression(Arguments args) {
				assertTrue(false);
			}
		});
	}

	@Test
	public void noExceptionThrownWhenTestFrameworkTestPasses() {
		When when = new When(getDummyGiven(), "bddExpression");
		when.then("then expression", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void theBddExpressionIsNull() {
		When when = new When(getDummyGiven(), "bddExpression");
		String bddExpression = null;
		
		when.then(bddExpression, new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void theBddExpressionIsEmpty() {
		When when = new When(getDummyGiven(), "bddExpression");
		String bddExpression = "";
		
		when.then(bddExpression, new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
	}

	private Given getDummyGiven() {
		Given given = mock(Given.class);
		UserStory userStory = new UserStory.WithTitle("Given Tests")
				.asA("Developer")
				.iCan("Write tests using bdd format")
				.create();
		
		Scenario scenario = userStory.scenarioWithTitle("Dealing With Testing Framework Results");
		when(given.getScenario()).thenReturn(scenario);
		return given;
	}
}