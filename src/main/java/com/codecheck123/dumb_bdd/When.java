package com.codecheck123.dumb_bdd;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.codecheck123.dumb_bdd.report.ReportRunner;

public class When extends AbstractBDD {

	private final Given given;
	private final String when;
	private AssertionError assErr;
	private static final ExecutorService es = Executors.newCachedThreadPool();

	/**
	 * Throws NullPointerException if parameters given or bddExpression is Null 
	 * @param given
	 * @param bddExpression
	 */
	When(Given given, String bddExpression){
		if(given == null){
			throw new NullPointerException("Given may not be NULL");
		}
		if(bddExpression == null || bddExpression.isEmpty()){
			throw new NullPointerException("BddExpression may not be NULL or Empty");
		}
		this.given = given;
		this.when = bddExpression;
	}

	public void then(final String then, ExpressionRunner runner){
		String story = given.getUserStory().getStory();
		List<String> allGiven = given.getAllGiven();
		try{
			evaluateExpression(then, runner);
		}catch(AssertionError e){
			assErr = e;
			throw e;
		}finally{
			es.execute(
				new ReportRunner(story, allGiven, when, then, assErr)
			);
		}
	}
}