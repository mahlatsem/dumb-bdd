package com.codecheck123.dumb_bdd.report;

import java.util.List;

public class HTMLReporter extends Reporter {

	private static final long serialVersionUID = -2999726418787095761L;

	public HTMLReporter(String userStory, List<String> given, String when,
			String then, AssertionError assErr) {
		super(userStory, given, when, then, assErr);
	}

	@Override
	public void write(){
		
	}
}
