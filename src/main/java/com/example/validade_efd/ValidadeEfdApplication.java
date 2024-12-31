package com.example.validade_efd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ValidadeEfdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidadeEfdApplication.class, args);
	}
	/*
	@Bean 
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) { 
		return args -> { 
			OpenCSVService openCSVService = ctx.getBean(OpenCSVService.class); 
			openCSVService.lerCSV("src\\main\\resources\\filesystem\\efd.txt"); 
		}; 
	}
	*/

	//TODO - Implementar genero de item no registro 0200
	//TODO - Implementar carga genero de item
}
