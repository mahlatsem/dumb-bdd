package com.codecheck123.dumb_bdd;

public class When {

	private final Given given;
	private final String when;
	
	When(Given given, String bddExpression){
		this.given = given;
		this.when = bddExpression;
	}
	
	public void then(String then, ExpressionRunner runner){
		System.out.println(given.getUserStory().getStory());
		given.getAll().forEach(g -> System.out.println(g));
		System.out.println(when);
		System.out.println(then);
	}
}
