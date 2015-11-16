package com.codecheck123.dumb_bdd.args;


public class Arguments {
	private final First first;
	private final Second second;
	private final Third third;
	private final Fourth fourth;
	private final Fifth fifth;
	
	public Arguments(String...s){
		this.first = new First(s[0]);
		this.second = new Second(s[0]);
		this.third = new Third(s[0]);
		this.fourth = new Fourth(s[0]);
		this.fifth = new Fifth(s[0]);
	}

	public First first() {
		return first;
	}
	
	public Second second() {
		return second;
	}
	
	public Third third() {
		return third;
	}
	
	public Fourth fourth() {
		return fourth;
	}
	
	public Fifth fith() {
		return fifth;
	}
}
