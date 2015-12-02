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
		System.out.println("UserStory: "+userStory);
		List<String> givenStatements = given;
		for(int i = 0; i < givenStatements.size(); i++){
			if(i == 0){
				System.out.println("Given: "+givenStatements.get(i));
			}else {
				System.out.println("And: "+givenStatements.get(i));
			}
		}
		System.out.println("When: "+when);
		System.out.println("Then: "+then);
		if(assertionError != null){
			System.out.println("Failed: "+assertionError.getMessage());
		}
	}
}
