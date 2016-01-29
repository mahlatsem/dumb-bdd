package com.codecheck123.dumb_bdd;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class UserStoryTest {
	
	@Test(expected=EmptyExpressionException.class)
	public void testNewUserStory_NULL_Story(){
		new UserStory(null);
	}
	
	@Test(expected=EmptyExpressionException.class)
	public void testNewUserStory_EmptyString(){
		new UserStory("");
	}

	@Test
	public void testCallingGivenNotNull(){
		UserStory story = new UserStory("some text");
		assertNotNull(story.given("some input", new ExpressionRunner() {
			public void expression(Arguments args) {}
		}));
	}
}
