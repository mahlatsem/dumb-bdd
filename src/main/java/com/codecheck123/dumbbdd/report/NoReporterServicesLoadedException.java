package com.codecheck123.dumbbdd.report;

public class NoReporterServicesLoadedException extends RuntimeException {
	private static final long serialVersionUID = -2216058903605896862L;
	
	public NoReporterServicesLoadedException(String message){
		super(message);
	}
}
