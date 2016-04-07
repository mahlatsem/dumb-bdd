package com.codecheck123.dumbbdd;

import java.util.ArrayList;
import java.util.List;

public class Given extends AbstractBDD {

	private final Scenario scenario;
	private final List<String> given = new ArrayList<String>();
	
	Given(Scenario scenario, String bddExpression, ExpressionRunner runner){
		this.scenario = scenario;
		given.add(bddExpression);
		evaluateExpression(bddExpression,runner);
	}

	Scenario getScenario() {
		return scenario;
	}

	List<String> getAllGiven() {
		return given;
	}
	
	public Given and(String bddExpression, ExpressionRunner runner){
		Util.checkForNotNullOrEmpty(bddExpression);
		given.add(bddExpression);
		evaluateExpression(bddExpression,runner);
		return this;
	}
	
	public When when(String bddExpression, ExpressionRunner runner){
		evaluateExpression(bddExpression,runner);
		return new When(this,bddExpression);
	}
}