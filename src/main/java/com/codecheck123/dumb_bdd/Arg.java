package com.codecheck123.dumb_bdd;

public class Arg {

	private final Object arg;
	
	/**
	 * Throws NullPointerException if arg is Null
	 * @param arg
	 */
	Arg(Object arg) {
		if(arg == null){
			throw new NullPointerException("arg cannot be null");
		}
		this.arg = arg;
	}

	public int asInt(){
		return Integer.parseInt((String) arg);
	}
	
	public double asDouble(){
		return Double.parseDouble((String) arg);
	}
	
	public String asString(){
		return (String)arg;
	}
	
	public boolean asBoolean(){
		return Boolean.valueOf((String) arg);
	}
}