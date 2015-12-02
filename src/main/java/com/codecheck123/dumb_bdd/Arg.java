package com.codecheck123.dumb_bdd;

public class Arg {

	private final Object arg;
	
	public Arg(Object arg) {
		this.arg = arg;
	}

	public int asInt(){
		return (int)arg;
	}
	
	public String asString(){
		return (String)arg;
	}
}
