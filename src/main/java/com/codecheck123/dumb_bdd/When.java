package com.codecheck123.dumb_bdd;

import java.util.concurrent.Executors;

import com.codecheck123.dumb_bdd.report.ConsoleReporter;
import com.codecheck123.dumb_bdd.report.Reporter;

public class When extends AbstractBDD {

	private final Given given;
	private final String when;
	private AssertionError assErr;
	
	When(Given given, String bddExpression){
		this.given = given;
		this.when = bddExpression;
	}
	
	public void then(String then, ExpressionRunner runner){
		try{
			evaluateExpression(then, runner);
		}catch(AssertionError e){
			assErr = e;
			throw e;
		}finally{
			Executors.newCachedThreadPool().execute(
					new Runnable() {

						@Override
						public void run() {
							String userStory = given.getUserStory().getStory();
							Reporter reporter = new ConsoleReporter(userStory,given.getAll(),when,then,assErr);
							reporter.write();
						}
					}
			);
		}
	}
}