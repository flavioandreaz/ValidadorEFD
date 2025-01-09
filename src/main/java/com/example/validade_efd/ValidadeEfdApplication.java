package com.example.validade_efd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.validade_efd.service.OpenCSVService;


@SpringBootApplication
public class ValidadeEfdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidadeEfdApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) { 
		return args -> { 
			OpenCSVService openCSVService = ctx.getBean(OpenCSVService.class); 
			openCSVService.lerCSV("src\\main\\resources\\filesystem\\efd.txt"); 
		}; 
	}
	

	//TODO - Implementar genero de item no registro 0200
	//TODO - Implementar carga genero de item
	//TODO - Implementar tabela Tabela 4.3.1 no registro 
	//       1510 09 CST_ICMS e H020, C170, C190, C320, 
	//       C470,C490, C510, C590, C610, C690, C790, C850, 
	//       C890, D190, D300, D390, D410, D510, D590, D610, D696
	//	
	//TODO - Revisar registro E311 todo
	//TODO - Revisar registro E310 todo vai usar duas implementações ?
	//TODO  -Revisar campo  02 COD_AJ Código do ajustes/benefício/incentivo, conforme
    //tabela indicada no item 5.3. C 010* - O O - C197
	//02 COD_MOD varias Registrs não estão usando 

	
}
