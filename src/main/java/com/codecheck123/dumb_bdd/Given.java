package com.codecheck123.dumb_bdd;

import java.util.ArrayList;
import java.util.List;

public class Given extends AbstractBDD {

	private final UserStory userStory;
	private final List<String> given = new ArrayList<String>();;
	
	Given(UserStory userStory, String bddExpression, ExpressionRunner runner){
		this.userStory = userStory;
		given.add(bddExpression);
		evaluateExpression(bddExpression,runner);
	}

	UserStory getUserStory() {
		return userStory;
	}

	List<String> getAll() {
		return given;
	}
	
	public Given and(String bddExpression, ExpressionRunner runner){
		given.add(bddExpression);
		evaluateExpression(bddExpression,runner);
		return this;
	}
	
	public When when(String bddExpression, ExpressionRunner runner){
		evaluateExpression(bddExpression,runner);
		return new When(this,bddExpression);
	}
}