package com.codecheck123.dumb_bdd;

import java.util.List;

public abstract class AbstractBDD {
	
	AbstractBDD(){}
	
	protected void evaluateExpression(String givenInput, ExpressionRunner runner) {
		List<String> argsCollection = ArgumentsParser.parseExpressionToArguments(givenInput);
		Arguments args = new Arguments(argsCollection);
		runner.expression(args);
	}
}
