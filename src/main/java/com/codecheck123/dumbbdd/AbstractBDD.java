package com.codecheck123.dumbbdd;

import java.util.List;

public abstract class AbstractBDD {
	
	private static final String NULL_EXPRESSION_RUNNER_MESSAGE = "ExpressionRunner may not be Null"
			+ " because it requires code to run as the action stated in the input expression\n"
			+ "See Example: https://github.com/mahlatsem/dumb-bdd";

	AbstractBDD(){}
	
	protected void evaluateExpression(String bddExpression, ExpressionRunner runner) {
		if(runner == null){
			throw new IllegalArgumentException(NULL_EXPRESSION_RUNNER_MESSAGE);
		}
		List<String> argsCollection = ArgumentsParser.parseExpressionToArguments(bddExpression);
		Arguments args = new Arguments(argsCollection);
		runner.expression(args);
	}
}
