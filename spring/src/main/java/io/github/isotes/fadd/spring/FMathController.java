package io.github.isotes.fadd.spring;

import io.github.isotes.fadd.library.FMath;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FMathController {
	@GetMapping("/add")
	public String add(int na, int da, int nb, int db) {
		return FMath.add(na, da, nb, db).toString();
	}
}
