package fr.eni.TPfilmotheque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import fr.eni.TPfilmotheque.BO.Genre;
import fr.eni.TPfilmotheque.dao.GenreRepository;
import fr.eni.TPfilmotheque.service.FilmService;
import fr.eni.TPfilmotheque.service.GenreService;

@Component
public class DonneesTestRunner {

	private FilmService filmService;
	private GenreService genreService;
	
	
	@Autowired
	public void setGenreService(GenreService genreService) {
		this.genreService = genreService;
	}
	
	@Autowired
	public void setFilmService(FilmService filmService) {
		this.filmService = filmService;
	}
	
	

	
	@Bean
	 public CommandLineRunner demo(GenreRepository repository) {
	 return (args) -> {
		
		 System.out.println("dans le runner");
		 repository.save(new Genre("Comédie"));
		 repository.save(new Genre("Drame"));
		 repository.save(new Genre("Action"));
	 
	 

	 };
	}


//	listeGenres.forEach(genre -> mapGenres.put(genre.getId(), genre));
//	
//	//puis save

}
