package fr.eni.TPfilmotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.eni.TPfilmotheque.BO.Film;
import fr.eni.TPfilmotheque.dao.FilmRepository;


@Service
public class FilmBDDServiceImpl implements FilmService {

	private FilmRepository filmRepository;
	
	//GenreRepository
	
	//@ModelAttribute("listeFilms") 
	public ArrayList<Film> initListeFilms() {
		return new ArrayList<Film>();
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


}
