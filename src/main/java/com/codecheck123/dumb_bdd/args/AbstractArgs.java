package com.codecheck123.dumb_bdd.args;

public class AbstractArgs {

	private final Object arg;
	
	public AbstractArgs(Object arg) {
		this.arg = arg;
	}

	public int asInt(){
		return (int)arg;
	}
	
	public String asString(){
		return (String)arg;
	}
}
