package com.codecheck123.dumb_bdd;

import com.codecheck123.dumb_bdd.report.ConsoleReporter;
import com.codecheck123.dumb_bdd.report.Reporter;

public class When extends AbstractBDD {

	private final Given given;
	private final String when;
	
	When(Given given, String bddExpression){
		this.given = given;
		this.when = bddExpression;
	}
	
	public void then(String then, ExpressionRunner runner){
		AssertionError assErr = null;
		try{
			evaluateExpression(then, runner);
		}catch(AssertionError e){
			assErr = e;
			throw e;
		}finally{
			String userStory = given.getUserStory().getStory();
			Reporter reporter = new ConsoleReporter(userStory,given.getAll(),when,then,assErr);
			reporter.write();
		}
	}
}