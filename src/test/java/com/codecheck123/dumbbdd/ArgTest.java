package com.codecheck123.dumbbdd;

import static org.fest.assertions.Assertions.*;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.codecheck123.dumbbdd.Arg;

public class ArgTest {
	
	@Test(expected=NullPointerException.class)
	public void testArg_withNull(){
		new Arg(null);
	}

	@Test
	public void testAsInt() {
		String i = "1";
		Arg arg = new Arg(i);
		assertThat(arg.asInt()).isEqualTo(Integer.parseInt(i));
	}

	@Test
	public void testAsDouble() {
		String d = "2.99";
		Arg arg = new Arg(d);
		assertThat(arg.asDouble()).isEqualTo(Double.parseDouble(d));
	}

	@Test
	public void testAsString() {
		String s = "value";
		Arg arg = new Arg(s);
		assertThat(arg.asString()).isEqualTo(s);
	}

	@Test
	public void testAsBoolean() {
		String b = "false";
		Arg arg = new Arg(b);
		assertFalse(arg.asBoolean());
	}

}
