package io.github.isotes.fadd.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(FMathController.class)
public class FMathControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void testAdd() throws Exception {
		mvc.perform(get("/add?na=1&da=2&nb=1&db=4"))
				.andExpect(status().isOk())
				.andExpect(content().string("3 / 4"));
	}
}
