package com.sjhtech.board;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	@Bean
	// Executed after the Spring Beans have been loaded
	public CommandLineRunner commandLineRunner(String[] args) {

		// Java Lambda expression
		return runner -> {
			System.out.printf("Hello World");
		};
	}
}
