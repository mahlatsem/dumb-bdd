package com.codecheck123.dumbbdd.report;

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
		
		ReportRunner runner = new ReportRunner(null);
		runner.run();
	}
}
