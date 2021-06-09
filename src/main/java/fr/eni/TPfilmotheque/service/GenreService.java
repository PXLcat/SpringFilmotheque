package fr.eni.TPfilmotheque.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.TPfilmotheque.BO.Genre;

@Service
public interface GenreService {

	void ajouterGenre(Genre genre);

	Map<Long,Genre> getMapGenres();
	List<Genre> getListeGenres();
}
