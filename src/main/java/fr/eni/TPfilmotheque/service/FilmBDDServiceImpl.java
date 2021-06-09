package fr.eni.TPfilmotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.TPfilmotheque.BO.Film;
import fr.eni.TPfilmotheque.dao.FilmRepository;


@Service
public class FilmBDDServiceImpl implements FilmService {

	private FilmRepository filmRepository;
	
	
	
	//@ModelAttribute("listeFilms") 
	public ArrayList<Film> initListeFilms() {
		//return new ArrayList<Film>();
		
		ArrayList<Film> liste = (ArrayList<Film>) filmRepository.findAll();
		return liste;
		
	}
	
	
	
	@Autowired
	public FilmBDDServiceImpl(FilmRepository filmRepository) {
		this.filmRepository = filmRepository;
	}
	
	@Override
	public void ajouterFilm(Film film) {
		filmRepository.save(film);		
	}

	@Override
	public List<Film> findAllFilms() {
		return filmRepository.findAll() ;
	}

	@GetMapping({ "/", "/listeFilms"})
	public String afficherListeFilms() {
		return "listeFilms";
	}
	
	@PostMapping("/formulaireFilms") 
	public String ajoutFilm(@ModelAttribute("film") Film film,
			@ModelAttribute("listeFilms") List<Film> listeFilms) {

		System.out.println("dans FilmBDDServiceImpl");
		listeFilms.add(film);
		return "redirect:/listeFilms";
	}
	
	
}
