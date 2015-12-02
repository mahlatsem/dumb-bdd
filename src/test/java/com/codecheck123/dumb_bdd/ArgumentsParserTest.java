package com.codecheck123.dumb_bdd;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ArgumentsParserTest {

	@Test
	public void testParseExpressionToArguments_withoutPlurals() {
		//given
		String input = "some input with argument '30' and 'baa'";
		
		//when: parsing the input
		List<String> args = ArgumentsParser.parseExpressionToArguments(input);
		
		//then string array of size 2 should be returned with baa in index 1
		assertEquals(2, args.size());
		assertEquals("baa", args.get(1));
	}
	
	@Test
	public void testParseExpressionToArguments_withPlurals() {
		//given
		String input = "some input's arguments are '30' and 'baa'";
		
		//when: parsing the input
		List<String> args = ArgumentsParser.parseExpressionToArguments(input);
		
		//then string array of size 2 should be returned with 30 in index 0
		assertEquals(2, args.size());
		assertEquals("30", args.get(0));
	}
	
	@Test
	public void testParseExpressionToArguments_withComma() {
		//given
		String input = "some comma separated arguments are '30', 'baa'";
		
		//when: parsing the input
		List<String> args = ArgumentsParser.parseExpressionToArguments(input);
		
		//then string array of size 2 should be returned with 30 in index 0
		assertEquals(2, args.size());
		assertEquals("30", args.get(0));
	}
	
	@Test
	public void testParseExpressionToArguments_startWithAndNoEndingWithInput() {
		//given
		String input = "'30', and another argument as 'baa' to end it off";
		
		//when: parsing the input
		List<String> args = ArgumentsParser.parseExpressionToArguments(input);
		
		//then string array of size 2 should be returned with 30 in index 0
		assertEquals(2, args.size());
		assertEquals("30", args.get(0));
	}
	
	@Test
	public void testParseExpressionToArguments_noArgumentsToPass() {
		//given
		String input = "no argument to pass";
		
		//when: parsing the input
		List<String> args = ArgumentsParser.parseExpressionToArguments(input);
		
		//then string array of size 2 should be returned with 30 in index 0
		assertEquals(0, args.size());
	}
}
