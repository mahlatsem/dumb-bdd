package com.codecheck123.dumbbdd;

import static org.junit.Assert.*;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import com.codecheck123.dumbbdd.Arguments;
import com.codecheck123.dumbbdd.ExpressionRunner;
import com.codecheck123.dumbbdd.Given;
import com.codecheck123.dumbbdd.UserStory;

public class GivenTest {

	@Test
	public void testGetUserStory() {
		Given given = new Given(new UserStory("story"), null, new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
		assertNotNull(given.getUserStory());
	}

	@Test
	public void testGetAll() {
		Given given = new Given(new UserStory("story"), "1st given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		})
		.and("2nd given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
		
		assertThat(given.getAllGiven().size()).isEqualTo(2);
	}

	@Test
	public void testWhen() {
		Given given = new Given(new UserStory("story"), "1st given", new ExpressionRunner() {
			public void expression(Arguments args) {}
		});
		
		assertNotNull(given.when("when", new ExpressionRunner() {
			public void expression(Arguments args) {}
		}));
	}

}
