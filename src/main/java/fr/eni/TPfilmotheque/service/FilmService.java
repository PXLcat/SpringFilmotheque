package fr.eni.TPfilmotheque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.TPfilmotheque.BO.Film;


@Service("filmService")
public interface FilmService {
	
	void ajouterFilm(Film film);
	List<Film> findAllFilms();
	

}
