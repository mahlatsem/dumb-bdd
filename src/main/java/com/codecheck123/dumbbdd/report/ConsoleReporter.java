package com.codecheck123.dumbbdd.report;

import java.util.List;

public class ConsoleReporter extends Reporter {

	private static final long serialVersionUID = -1386795121043085914L;

	public ConsoleReporter(Report report) {
		super(report);
	}

	@Override
	public void write(){
		System.out.println("UserStory: "+report.getUserStorytitle());
		System.out.println(report.getUserStory());
		System.out.println("Scenario: "+report.getScenarioTitle());
		List<String> givenStatements = report.getAllGiven();
		for(int i = 0; i < givenStatements.size(); i++){
			if(i == 0){
				System.out.println("Given: "+givenStatements.get(i));
			}else {
				System.out.println("And: "+givenStatements.get(i));
			}
		}
		System.out.println("When: "+report.getWhen());
		System.out.println("Then: "+report.getThen());
		if(report.getAssertionError() != null){
			if(report.getAssertionError().getMessage() != null){
				System.out.println("Failed: "+report.getAssertionError().getMessage());
			}else{
				if(report.getAssertionError().getSuppressed() != null){
					Throwable[] suppresed = report.getAssertionError().getSuppressed();
					for(Throwable th : suppresed){
						System.out.println("Suppresed Error: "+th.getMessage());
					}
				}
			}
			System.out.println();
		}else{
			System.out.println("Passed\n");
		}
	}
}
