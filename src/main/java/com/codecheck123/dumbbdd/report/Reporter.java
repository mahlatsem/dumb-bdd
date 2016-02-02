package com.codecheck123.dumbbdd.report;

import java.io.Serializable;
import java.util.List;

public abstract class Reporter implements Serializable {
	private static final long serialVersionUID = -1522773193391046992L;

	protected final String userStory;
	protected final List<String> given;
	protected final String when;
	protected final String then;
	protected final AssertionError assertionError;
	
	public Reporter(String userStory, List<String> given, String when, String then, AssertionError assErr) {
		this.userStory = userStory;
		this.given = given;
		this.when = when;
		this.then = then;
		this.assertionError = assErr;
	}

	public abstract void write();
}