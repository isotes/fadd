package io.github.isotes.fadd.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication(scanBasePackages = "io.github.isotes.fadd.spring")
public class FMathApplication implements CommandLineRunner {
	@SuppressWarnings("unused")
	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(FMathApplication.class, args);
	}


	@Override
	public void run(String... args) {
		System.out.println("FADD running at http://" + environment.getProperty("server.address") + ":" + environment.getProperty("local.server.port"));
	}
}
