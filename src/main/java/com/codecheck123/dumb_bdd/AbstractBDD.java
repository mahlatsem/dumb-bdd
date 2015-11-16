package com.codecheck123.dumb_bdd;

import com.codecheck123.dumb_bdd.args.Arguments;

public class AbstractBDD {

	protected void buildArgs(String givenInput, ExpressionRunner runner) {
		Arguments args = new Arguments("");
		runner.expression(args);
	}
}
