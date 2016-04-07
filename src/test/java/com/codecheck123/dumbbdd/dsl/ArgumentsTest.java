package com.codecheck123.dumbbdd.dsl;

import java.util.Arrays;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import com.codecheck123.dumbbdd.dsl.Arguments;

public class ArgumentsTest {
	final Arguments arguments = new Arguments(Arrays.asList("0","1","2","3","4"));

	@Test
	public void testArguments_NULLShouldNotThrowNullPointer() {
		new Arguments(null);
	}

	@Test
	public void testFirst() {
		assertThat(arguments.first().asString()).isEqualTo("0");
	}

	@Test
	public void testSecond() {
		assertThat(arguments.second().asString()).isEqualTo("1");
	}

	@Test
	public void testThird() {
		assertThat(arguments.third().asString()).isEqualTo("2");
	}

	@Test
	public void testFourth() {
		assertThat(arguments.fourth().asString()).isEqualTo("3");
	}

	@Test
	public void testFith() {
		assertThat(arguments.fith().asString()).isEqualTo("4");
	}

}
