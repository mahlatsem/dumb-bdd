package com.codecheck123.dumb_bdd.report;

import java.util.List;

public class ReportRunner implements Runnable {
	
	private final String userStory;
	private final List<String> allGiven;
	private final String when;
	private final String then;
	private final AssertionError assErr;
	
	public ReportRunner(String userStory, List<String> allGiven,String when, String then,AssertionError assErr){
		this.userStory = userStory;
		this.allGiven = allGiven;
		this.when = when;
		this.then = then;
		this.assErr = assErr;
	}

	public void run() {
		Reporter reporter = new ConsoleReporter(userStory,allGiven,when,then,assErr);
		reporter.write();
	}
}
