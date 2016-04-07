package com.codecheck123.dumbbdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.codecheck123.dumbbdd.UserStory;

public class UserStoryTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryTitleIsNull(){
		new UserStory.WithTitle(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryTitleIsEmpty(){
		new UserStory.WithTitle("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryRoleIsEmpty(){
		new UserStory.WithTitle("UserStory Role is Empty")
		.asA("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryRoleIsNull(){
		new UserStory.WithTitle("UserStory Role is Null")
		.asA(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryGoalOrDesireIsNull(){
		new UserStory.WithTitle("UserStory GoalOrDesire is Null")
		.asA("Developer")
		.iWant(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryGoalOrDesireIsEmpty(){
		new UserStory.WithTitle("UserStory GoalOrDesire is Empty")
		.asA("Developer")
		.iWant("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryActionIsEmpty(){
		new UserStory.WithTitle("UserStory Action is Empty")
		.asA("Developer")
		.iCan("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryActionIsNull(){
		new UserStory.WithTitle("UserStory Action is Null")
		.asA("Developer")
		.iCan(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryProvidedBenefitIsNull(){
		new UserStory.WithTitle("UserStory ProvidedBenefit is Null")
		.asA("Developer")
		.iCan("Perfom some action")
		.soThat(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void userStoryProvidedBenefitIsEmpty(){
		new UserStory.WithTitle("UserStory ProvidedBenefit is Empty")
		.asA("Developer")
		.iCan("Perfom some action")
		.soThat("");
	}
	
	@Test
	public void userStoryIsCreatedWithoutException(){
		UserStory userStory = new UserStory.WithTitle("UserStory is created without exception")
				.asA("Developer")
				.iWant("to write a UserStory")
				.soThat("I can have it alongside my code")
				.create();
		
		assertNotNull(userStory);
	}
}
