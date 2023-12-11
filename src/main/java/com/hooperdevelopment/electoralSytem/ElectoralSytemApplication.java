package com.hooperdevelopment.electoralSytem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ElectoralSytemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectoralSytemApplication.class, args);
	}

	@GetMapping(path="/")
	public List<String> getNames() {
		return List.of("pepe", "memo", "luli");
	}

}
