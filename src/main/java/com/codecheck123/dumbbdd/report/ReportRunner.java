package com.codecheck123.dumbbdd.report;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.codecheck123.dumbbdd.report.service.ReporterService;

public class ReportRunner implements Runnable {
	
	private final Report report;
	private static final String NO_REPORTER_SERVICE_LOADED = "Make sure you are implementing ReporterService "
			+ "and that you have updated your META-INF/services/"
			+ ReporterService.class.getName()+" accordingly. For more information "
					+ "follow: http://docs.oracle.com/javase/6/docs/api/java/util/ServiceLoader.html";
	
	public ReportRunner(Report report){
		this.report = report;
	}

	public void run() {
		Iterator<ReporterService> loadersItr = loadRepoterProviders();
		if(!loadersItr.hasNext()){
			throw new NoReporterServicesLoadedException(NO_REPORTER_SERVICE_LOADED);
		}
		
		while(loadersItr.hasNext()){
			ReporterService service = loadersItr.next();
			process(service);
		}
	}

	private void process(ReporterService service) {
		Reporter reporter = service.createReporter(report);
		reporter.write();
	}

	private Iterator<ReporterService> loadRepoterProviders() {
		ServiceLoader<ReporterService> loader = ServiceLoader.load(ReporterService.class);
		return loader.iterator();
	}
}
