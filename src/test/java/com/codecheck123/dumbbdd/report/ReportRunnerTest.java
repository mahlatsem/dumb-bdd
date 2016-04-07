package com.codecheck123.dumbbdd.report;

import java.util.Arrays;

import org.junit.Test;

import com.codecheck123.dumbbdd.Scenario;
import com.codecheck123.dumbbdd.UserStory;

public class ReportRunnerTest {

	@Test
	public void noExceptionsThrown() throws InterruptedException {
		Scenario scenario = new UserStory.WithTitle("Reporting")
				.asA("Developer")
				.iCan("Have a report of my tests")
				.create()
				.scenarioWithTitle("Running reporter");
		
		Report report = new Report.ReportBuilder()
				.setUserStoryTitle("Reporting")
				.setUserStory("fill Story")
				.setScenarioTitle("Reporting")
				.setAllGiven(Arrays.asList("a","b"))
				.setWhen("when")
				.setThen("then")
				.setAssertionError(null)
				.build();
		ReportRunner runner = new ReportRunner(report);
		runner.run();
	}
}
