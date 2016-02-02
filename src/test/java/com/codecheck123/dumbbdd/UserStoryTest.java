package com.codecheck123.dumbbdd;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.codecheck123.dumbbdd.Arguments;
import com.codecheck123.dumbbdd.EmptyExpressionException;
import com.codecheck123.dumbbdd.ExpressionRunner;
import com.codecheck123.dumbbdd.UserStory;

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
