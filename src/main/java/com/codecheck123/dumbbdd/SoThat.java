package com.codecheck123.dumbbdd;

public class SoThat {
	private UserStory userStory;
	
	SoThat(UserStory userStory) {
		this.userStory = userStory;
	}

	public UserStory create() {
		return userStory;
	}
}
