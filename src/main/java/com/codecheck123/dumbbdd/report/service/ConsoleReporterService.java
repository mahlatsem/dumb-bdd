package com.codecheck123.dumbbdd.report.service;

import java.util.List;

import com.codecheck123.dumbbdd.Scenario;
import com.codecheck123.dumbbdd.report.ConsoleReporter;
import com.codecheck123.dumbbdd.report.Reporter;

public class ConsoleReporterService implements ReporterService {

	public Reporter createReporter(Scenario scenario, List<String> allGiven, String when, String then, AssertionError assErr){
		return new ConsoleReporter(scenario, allGiven, when, then, assErr);
	}
}
