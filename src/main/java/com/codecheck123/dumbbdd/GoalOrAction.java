package com.codecheck123.dumbbdd;

public abstract class GoalOrAction {
	private static final String SO_THAT = "so that ";
	
	protected UserStory userStory;
	
	GoalOrAction(UserStory userStory){
		this.userStory = userStory;
	}
	
	/**
	 * @param benefit Benefit of the goal/desire or performing an action
	 * @throws IllegalArgumentException If the provided Benefit is NULL or an Empty string
	 */
	public SoThat soThat(String benefit){
		userStory.appendUserExpression(SO_THAT, benefit);
		return new SoThat(userStory);
	}
	
	public UserStory create() {
		return userStory;
	}
}
