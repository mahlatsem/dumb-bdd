package com.codecheck123.dumb_bdd;

public class UserStory extends AbstractBDD {

	private final String story;
		
	public UserStory(String story){
		this.story = story;
	}
	
	public Given given(String givenInput, ExpressionRunner runner){
		return new Given(this,givenInput);
	}

	String getStory() {
		return story;
	}
}