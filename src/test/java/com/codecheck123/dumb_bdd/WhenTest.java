package com.codecheck123.dumb_bdd;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class WhenTest {

	@Test(expected=NullPointerException.class)
	public void testThen_NullGiven() {
		new When(null, "when expression");
	}
	
	@Test(expected=NullPointerException.class)
	public void testThen_BddExpressionNull() {
		new When(mock(Given.class), null);
	}
	
	@Test(expected=NullPointerException.class)
	public void testThen_BddExpressionEmpty() {
		new When(mock(Given.class), "");
	}
	
	@Test(expected=AssertionError.class)
	public void testThen_assertInExpressionFails() {
		new When(getDummyGiven(), "bddExpression")
		.then("then expression", new ExpressionRunner() {
			public void expression(Arguments args) {
				assertTrue(false);
			}
		});
	}

	@Test
	public void testThen_shouldNotThrowException() {
		When when = new When(getDummyGiven(), "bddExpression");
		when.then("then expression", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
	}
	

	private Given getDummyGiven() {
		Given given = mock(Given.class);
		when(given.getUserStory()).thenReturn(new UserStory("some story"));
		return given;
	}
}