package com.codecheck123.dumbbdd.dsl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.codecheck123.dumbbdd.dsl.Arguments;
import com.codecheck123.dumbbdd.dsl.ExpressionRunner;
import com.codecheck123.dumbbdd.dsl.Scenario;
import com.codecheck123.dumbbdd.dsl.UserStory;

public class ScenarioTest {
	UserStory story = new UserStory.WithTitle("Creating different scenarios")
			.asA("Developer")
			.iCan("test for different scenarios")
			.create();

	@Test(expected=IllegalArgumentException.class)
	public void scenarioWithEmptyTitle() {
		story.scenarioWithTitle("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void scenarioWithNullTitle() {
		story.scenarioWithTitle(null);
	}
	
	@Test
	public void scenarioWhereGivenParametersAreNotNull(){
		Scenario scenario = story.scenarioWithTitle("Given parameters are not NULL");
		
		assertNotNull(scenario.given("some input", new ExpressionRunner() {
			public void expression(Arguments args) {}
		}));
	}

	@Test(expected=IllegalArgumentException.class)
	public void scenarioWhereGivenInputExpressionIsNull(){
		Scenario scenario = story.scenarioWithTitle("Given input Expression is NULL");
		String inputExpression = null;
		
		assertNotNull(scenario.given(inputExpression, new ExpressionRunner() {
			public void expression(Arguments args) {}
		}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void scenarioWhereGivenInputExpressionIsEmpty(){
		Scenario scenario = story.scenarioWithTitle("Given input Expression is Empty");
		String inputExpression = "";
		
		assertNotNull(scenario.given(inputExpression, new ExpressionRunner() {
			public void expression(Arguments args) {}
		}));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void scenarioWhereExpressionToBeRanIsNull(){
		Scenario scenario = story.scenarioWithTitle("Expression to run is Null");
		String inputExpression = "Correct input Expression";
		ExpressionRunner expressionToRun = null;
		
		assertNotNull(scenario.given(inputExpression, expressionToRun));
	}
}
