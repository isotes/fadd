package io.github.isotes.fadd.jfxui;

import io.github.isotes.fadd.library.FMath;

public class JfxMain {
	public static void main(String[] args) {
		if (args.length > 0) {
			JfxMain.cli(args);
			return;
		}

		FaddJfxApp.main(args);
	}

	private static void cli(String[] args) {
		if (args.length != 4) {
			System.out.println("usage: NumeratorA DenominatorA NumeratorB DenominatorB");
			System.out.println("  add fractions");
			System.exit(1);
		}
		int pos = 0;
		int na = Integer.parseInt(args[pos++]);
		int da = Integer.parseInt(args[pos++]);
		int nb = Integer.parseInt(args[pos++]);
		int db = Integer.parseInt(args[pos++]);
		System.out.println(FMath.addS(na, da, nb, db));
	}
}
