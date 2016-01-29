package com.codecheck123.dumb_bdd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ArgumentsParser {
	
	private ArgumentsParser(){}
	
	private final static Pattern pattern = Pattern.compile("(?:^|\\s|,)'([^']*?)'");

	static List<String> parseExpressionToArguments(String givenInput) {
		if(givenInput == null){
			return new ArrayList<String>(0);
		}
		List<String> matches = new ArrayList<String>(5);
		Matcher m = pattern.matcher(givenInput);
		while(m.find()){
			matches.add(m.group(1));
		}
		return matches;
	}
}