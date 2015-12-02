package com.codecheck123.dumb_bdd;

import java.util.ArrayList;
import java.util.List;


public class Arguments {
	private final List<Arg> args;
	
	public Arguments(List<String> args){
		this.args = new ArrayList<Arg>(args.size());
		for(String arg : args){
			this.args.add(new Arg(arg));
		}
	}

	public Arg first() {
		return args.get(0);
	}
	
	public Arg second() {
		return args.get(1);
	}
	
	public Arg third() {
		return args.get(2);
	}
	
	public Arg fourth() {
		return args.get(3);
	}
	
	public Arg fith() {
		return args.get(4);
	}
}
