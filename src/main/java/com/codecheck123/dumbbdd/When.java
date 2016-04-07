package com.codecheck123.dumbbdd;

import java.util.List;
import com.codecheck123.dumbbdd.report.Report;
import com.codecheck123.dumbbdd.report.ReportRunner;

public class When extends AbstractBDD {

	private final Given given;
	private final String when;
	private AssertionError assErr;

	/**
	 * Throws IllegalArgumentException if parameters given or bddExpression is Null 
	 * @param given
	 * @param bddExpression
	 */
	When(Given given, String bddExpression){
		if(given == null){
			throw new IllegalArgumentException("Given may not be NULL");
		}
		Util.checkForNotNullOrEmpty(bddExpression);
		this.given = given;
		this.when = bddExpression;
	}

	public void then(final String then, ExpressionRunner runner){
		Util.checkForNotNullOrEmpty(then);
		
		try{
			evaluateExpression(then, runner);
		}catch(AssertionError e){
			assErr = e;
			throw e;
		}finally{
			Report report = buildReport(then);
			new ReportRunner(report).run();
		}
	}

	private Report buildReport(String then) {
		Scenario scenario = given.getScenario();
		List<String> allGiven = given.getAllGiven();
		UserStory userStory = scenario.getUserStory();
		
		Report report = new Report.ReportBuilder()
				.setUserStoryTitle(userStory.getTitle())
				.setUserStory(userStory.getStory())
				.setScenarioTitle(scenario.getTitle())
				.setAllGiven(allGiven)
				.setWhen(when)
				.setThen(then)
				.setAssertionError(assErr)
				.build();

		return report;
	}
}