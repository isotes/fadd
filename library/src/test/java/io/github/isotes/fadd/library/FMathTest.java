package io.github.isotes.fadd.library;

import org.apache.commons.math3.fraction.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FMathTest {
	private static Fraction ONE_HALF = new Fraction(1, 2);
	private static Fraction ONE_QUARTER = new Fraction(1, 4);
	private static Fraction THREE_QUARTERS = new Fraction(3, 4);

	@Test
	void testAdd() {
		assertEquals(THREE_QUARTERS, FMath.add(ONE_HALF, ONE_QUARTER));
	}

	@Test
	void testAdd1() {
		assertEquals(THREE_QUARTERS, FMath.add(1, 2, 1, 4));
	}
}
