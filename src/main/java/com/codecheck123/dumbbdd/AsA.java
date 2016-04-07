package com.codecheck123.dumbbdd;

public class AsA {
	private static final String I_WANT = ", I want ";
	private static final String I_CAN = ", I can ";
	
	private UserStory userStory;
	
	AsA(UserStory userStory) {
		this.userStory = userStory;
	}

	/**
	 * @param goalOrDesire Goal/Desire of the User
	 * @throws IllegalArgumentException If the Goal/Desire is NULL or an Empty string
	 */
	public IWant iWant(String goalOrDesire) {
		userStory.appendUserExpression(I_WANT, goalOrDesire);
		return new IWant(userStory);
	}

	/**
	 * @param action User action with system
	 * @throws IllegalArgumentException If the Action is NULL or an Empty string
	 */
	public ICan iCan(String action) {
		userStory.appendUserExpression(I_CAN, action);
		return new ICan(userStory);
	}
}
