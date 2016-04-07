package com.codecheck123.dumbbdd.dsl;

import java.io.Serializable;

public class Scenario implements Serializable {

	private static final long serialVersionUID = -8576874810439342547L;
	private final String title;
	private final UserStory userStory;
	
	Scenario(UserStory userStory, String title) {
		this.title = title;
		this.userStory = userStory;
	}
	
	String getTitle() {
		return title;
	}

	UserStory getUserStory() {
		return userStory;
	}

	public Given given(String givenInput, ExpressionRunner runner){
		Util.checkForNotNullOrEmpty(givenInput);
		return new Given(this,givenInput, runner);
	}
}