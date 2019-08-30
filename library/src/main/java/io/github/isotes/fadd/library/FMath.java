package io.github.isotes.fadd.library;

import org.apache.commons.math3.fraction.Fraction;

public class FMath {
	public static Fraction add(Fraction a, Fraction b) {
		return a.add(b);
	}

	public static Fraction add(int numeratorA, int denominatorA, int numeratorB, int denominatorB) {
		return new Fraction(numeratorA, denominatorA).add(new Fraction(numeratorB, denominatorB));
	}

	public static String addS(int numeratorA, int denominatorA, int numeratorB, int denominatorB) {
		Fraction res = FMath.add(numeratorA, denominatorA, numeratorB, denominatorB);
		return String.format("%d/%d + %d/%d = %d/%d", numeratorA, denominatorA, numeratorB, denominatorB, res.getNumerator(), res.getDenominator());
	}
}
