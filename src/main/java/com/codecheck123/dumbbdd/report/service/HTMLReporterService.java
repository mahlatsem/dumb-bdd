package com.codecheck123.dumbbdd.report.service;

import com.codecheck123.dumbbdd.report.HTMLReporter;
import com.codecheck123.dumbbdd.report.Report;
import com.codecheck123.dumbbdd.report.Reporter;

public class HTMLReporterService implements ReporterService {

	public Reporter createReporter(Report report){
		return new HTMLReporter(report);
	}
}
