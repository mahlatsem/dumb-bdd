package com.codecheck123.dumbbdd.report;

import java.io.Serializable;

public abstract class Reporter implements Serializable {
	private static final long serialVersionUID = -1522773193391046992L;

	protected final Report report;
	
	public Reporter(Report report) {
		this.report = report;
	}

	public abstract void write();
}