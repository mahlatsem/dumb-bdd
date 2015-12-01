package com.codecheck123.dumb_bdd;

import java.util.Iterator;
import java.util.List;

import com.codecheck123.dumb_bdd.args.Fifth;
import com.codecheck123.dumb_bdd.args.First;
import com.codecheck123.dumb_bdd.args.Fourth;
import com.codecheck123.dumb_bdd.args.Second;
import com.codecheck123.dumb_bdd.args.Third;


public class Arguments {
	private final First first;
	private final Second second;
	private final Third third;
	private final Fourth fourth;
	private final Fifth fifth;
	
	public Arguments(List<String> args){
		Iterator<String> itr = args.iterator();
		this.first = itr.hasNext() ? new First(itr.next()) : null;
		this.second = itr.hasNext() ? new Second(itr.next()) : null;
		this.third = itr.hasNext() ? new Third(itr.next()) : null;
		this.fourth = itr.hasNext() ? new Fourth(itr.next()) : null;
		this.fifth = itr.hasNext() ? new Fifth(itr.next()) : null;
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
