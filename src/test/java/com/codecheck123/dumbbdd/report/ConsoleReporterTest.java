package com.codecheck123.dumbbdd.report;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.codecheck123.dumbbdd.report.ConsoleReporter;
import com.codecheck123.dumbbdd.report.Reporter;

public class ConsoleReporterTest {
	
	private String userStory = "Some Story";
	private String when = "when somethign happens";
	private String then = "do something";

	@Test
	public void testWrite_MoreThanOneGiven() {
		List<String> allGiven = Arrays.asList("input a","input b");
		AssertionError assErr = new AssertionError();
		Report report = buildReport(allGiven,assErr);
		
		Reporter reporter = new ConsoleReporter(report);
		reporter.write();
	}

	@Test
	public void testWrite_OneGiven() {
		List<String> allGiven = Arrays.asList("input a");
		AssertionError assErr = new AssertionError();
		Report report = buildReport(allGiven,assErr);
		
		Reporter reporter = new ConsoleReporter(report);
		reporter.write();
	}
	
	@Test
	public void testWrite_WhithoutAssertionError() {
		List<String> allGiven = Arrays.asList("input a");
		AssertionError assErr = null;
		Report report = buildReport(allGiven,assErr);
		
		Reporter reporter = new ConsoleReporter(report);
		reporter.write();
	}


	private Report buildReport(List<String> allGiven, AssertionError assErr) {
		Report report = new Report.ReportBuilder()
				.setUserStoryTitle("UserStory Title")
				.setUserStory(userStory)
				.setAllGiven(allGiven)
				.setWhen(when)
				.setThen(then)
				.setAssertionError(assErr)
				.build();
		return report;
	}
}
