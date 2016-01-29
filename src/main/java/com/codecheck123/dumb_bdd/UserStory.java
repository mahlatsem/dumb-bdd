package com.codecheck123.dumb_bdd;

public class UserStory extends AbstractBDD {

	private final String story;
	
	/**
	 * Throws EmptyExpressionException if story is NULL or an empty string.
	 * @param story
	 */
	public UserStory(String story){
		if(story == null || story.isEmpty()){
			throw new EmptyExpressionException("Story may not be NULL or Empty");
		}
		this.story = story;
	}
	
	public Given given(String givenInput, ExpressionRunner runner){
		return new Given(this,givenInput, runner);
	}

	String getStory() {
		return story;
	}
}