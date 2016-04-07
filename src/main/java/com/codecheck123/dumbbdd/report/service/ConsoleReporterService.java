package com.codecheck123.dumbbdd.report.service;

import com.codecheck123.dumbbdd.report.ConsoleReporter;
import com.codecheck123.dumbbdd.report.Report;
import com.codecheck123.dumbbdd.report.Reporter;

public class ConsoleReporterService implements ReporterService {

	public Reporter createReporter(Report report){
		return new ConsoleReporter(report);
	}
}
