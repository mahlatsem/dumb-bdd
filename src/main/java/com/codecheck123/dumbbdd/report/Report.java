package com.codecheck123.dumbbdd.report;

import java.util.List;

public class Report {

	private final String userStorytitle;
	private final String userStory;
	private final String scenarioTitle;
	private final List<String> allGiven;
	private final String when;
	private final String then;
	private final AssertionError assErr;
	
	private Report(ReportBuilder reportBuilder) {
		this.userStorytitle = reportBuilder.getUserStoryTitle();
		this.userStory = reportBuilder.getUserStory();
		this.scenarioTitle = reportBuilder.getScenarioTitle();
		this.allGiven = reportBuilder.getAllGiven();
		this.when = reportBuilder.getWhen();
		this.then = reportBuilder.getThen();
		this.assErr = reportBuilder.getAssertionError();
	}

	public String getUserStorytitle() {
		return userStorytitle;
	}

	public String getUserStory() {
		return userStory;
	}

	public String getScenarioTitle() {
		return scenarioTitle;
	}

	public List<String> getAllGiven() {
		return allGiven;
	}

	public String getWhen() {
		return when;
	}

	public String getThen() {
		return then;
	}

	public AssertionError getAssertionError() {
		return assErr;
	}

	public static class ReportBuilder {
		private String userStorytitle;
		private String userStory;
		private String scenarioTitle;
		private List<String> allGiven;
		private String when;
		private String then;
		private AssertionError assErr;

		public ReportBuilder setUserStoryTitle(String title) {
			this.userStorytitle = title;
			return this;
		}
		
		public String getUserStoryTitle() {
			return userStorytitle;
		}

		public ReportBuilder setUserStory(String story) {
			this.userStory = story;
			return this;
		}
		
		public String getUserStory() {
			return userStory;
		}

		public ReportBuilder setScenarioTitle(String title) {
			this.scenarioTitle = title;
			return this;
		}
		
		public String getScenarioTitle() {
			return scenarioTitle;
		}

		public ReportBuilder setAllGiven(List<String> allGiven) {
			this.allGiven = allGiven;
			return this;
		}
		
		public List<String> getAllGiven() {
			return allGiven;
		}

		public ReportBuilder setWhen(String when) {
			this.when = when;
			return this;
		}
		
		public String getWhen() {
			return when;
		}

		public ReportBuilder setThen(String then) {
			this.then = then;
			return this;
		}
		
		public String getThen() {
			return then;
		}

		public ReportBuilder setAssertionError(AssertionError assErr) {
			this.assErr = assErr;
			return this;
		}
		
		public AssertionError getAssertionError() {
			return assErr;
		}

		public Report build() {
			return new Report(this);
		}
	}
}
