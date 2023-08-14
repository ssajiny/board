package com.sjhtech.board;

import com.sjhtech.board.dao.UserDAO;
import com.sjhtech.board.entity.User;
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
	public CommandLineRunner commandLineRunner(UserDAO userDAO) {

		// Java Lambda expression
		return runner -> {
			createUser(userDAO);
		};
	}

	private void createUser(UserDAO userDAO) {
		System.out.println("Creating new user object ...");
		User user = new User("sang", "jin", "ssajiny@naver.com");

		System.out.println("Saving the User ...");
		userDAO.save(user);

		System.out.println("Saved User. Generated ID: " + user.getId());
	}
}
