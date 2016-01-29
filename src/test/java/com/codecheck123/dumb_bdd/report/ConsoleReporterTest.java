package com.codecheck123.dumb_bdd.report;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ConsoleReporterTest {
	
	private String userStory = "Some Story";
	private String when = "when somethign happens";
	private String then = "do something";

	@Test
	public void testWrite_MoreThanOneGiven() {
		List<String> allGiven = Arrays.asList("input a","input b");
		AssertionError assErr = new AssertionError();
		
		Reporter reporter = new ConsoleReporter(userStory, allGiven, when, then, assErr);
		reporter.write();
	}
	
	@Test
	public void testWrite_OneGiven() {
		List<String> allGiven = Arrays.asList("input a");
		AssertionError assErr = new AssertionError();
		
		Reporter reporter = new ConsoleReporter(userStory, allGiven, when, then, assErr);
		reporter.write();
	}
	
	@Test
	public void testWrite_WhithoutAssertionError() {
		List<String> allGiven = Arrays.asList("input a");
		AssertionError assErr = null;
		
		Reporter reporter = new ConsoleReporter(userStory, allGiven, when, then, assErr);
		reporter.write();
	}

}
