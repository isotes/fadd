package io.github.isotes.fadd.spring;

import io.github.isotes.fadd.library.FMath;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultController {
	@GetMapping("/result")
	public String index(int na, int da, int nb, int db, Model model) {
		model.addAttribute("result", FMath.addS(na, da, nb, db));
		return "index";
	}
}
