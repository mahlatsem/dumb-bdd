package com.codecheck123.dumbbdd.report;

import java.util.Arrays;

import org.junit.Test;

import com.codecheck123.dumbbdd.dsl.Arguments;
import com.codecheck123.dumbbdd.dsl.ExpressionRunner;
import com.codecheck123.dumbbdd.dsl.UserStory;

public class ReportRunnerTest {

	@Test
	public void noExceptionsThrown() throws InterruptedException {
		UserStory userStory = new UserStory.WithTitle("Reporting")
				.asA("Developer")
				.iCan("Have a report of my tests")
				.create();
		
		final Report.ReportBuilder reportBuilder = new Report.ReportBuilder();
		
		userStory.scenarioWithTitle("Success Scenario of Running a reporter")
			.given("User story title 'Reporting'", new ExpressionRunner() {
				public void expression(Arguments args) {
					reportBuilder.setUserStoryTitle(args.first().asString());
				}
			})
			.and("User story 'As a Developer, I can run reports'", new ExpressionRunner() {
				public void expression(Arguments args) {
					reportBuilder.setUserStory(args.first().asString());
				}
			})
			.and("Scenario title 'Reporting' with given expressions 'a' and 'b'", new ExpressionRunner() {
				public void expression(Arguments args) {
					reportBuilder.setScenarioTitle(args.first().asString());
					reportBuilder.setAllGiven(Arrays.asList(args.second().asString(),args.third().asString()));
				}
			})
			.and("When 'I run' and then 'report should be published'", new ExpressionRunner() {
				public void expression(Arguments args) {
					reportBuilder.setWhen(args.first().asString());
					reportBuilder.setThen(args.second().asString());
				}
			})
			.when("I run the report", new ExpressionRunner() {
				public void expression(Arguments args) {
					Report report = reportBuilder.build();
					ReportRunner runner = new ReportRunner(report);
					runner.run(); //because if ran by a different thread, would run outside the test
				}
			})
			.then("Should run with no errors", new ExpressionRunner() {
				public void expression(Arguments args) {
				}
			});
	}
}
