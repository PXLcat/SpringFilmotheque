package fr.eni.TPfilmotheque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.eni.TPfilmotheque.dao.GenreRepository;
import fr.eni.TPfilmotheque.service.FilmService;
import fr.eni.TPfilmotheque.service.GenreService;

@SpringBootApplication
public class TPfilmothequeApplication {


	
	public static void main(String[] args) {
		
		SpringApplication.run(TPfilmothequeApplication.class, args);
	}



	 
	
}
