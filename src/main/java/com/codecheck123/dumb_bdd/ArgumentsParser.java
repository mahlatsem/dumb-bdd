package com.codecheck123.dumb_bdd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArgumentsParser {
	
	private final static Pattern pattern = Pattern.compile("(?:^|\\s|,)'([^']*?)'");

	public static List<String> parseExpressionToArguments(String givenInput) {
		List<String> matches = new ArrayList<String>(5);
		Matcher m = pattern.matcher(givenInput);
		while(m.find()){
			matches.add(m.group(1));
		}
		return matches;
	}
}