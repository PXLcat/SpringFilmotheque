package fr.eni.TPfilmotheque.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.TPfilmotheque.BO.Genre;

@Service
public class GenreService {

	//Au lieu de service, implémentation
	
	private List<Genre> listeGenres;
	private Map<Long,Genre> mapGenres;
	
	public GenreService() {
		
//		//Mettre dans un CommandLineRunner
//		listeGenres = new ArrayList<>();
//		listeGenres.add(new Genre("Comédie"/*, 0*/));
//		listeGenres.add(new Genre("Drame"/*, 1*/));
//		listeGenres.add(new Genre("Action"/*, 2*/));
//		
//		mapGenres = new HashMap<Long, Genre>();
//
//		listeGenres.forEach(genre -> mapGenres.put(genre.getId(), genre));
//		
//		//puis save
	}
	
	
	
	
	public List<Genre> getListeGenres() {
		return listeGenres;
	}
	public void setListeGenres(List<Genre> listeGenres) {
		this.listeGenres = listeGenres;
	}
	public Map<Long,Genre> getMapGenres() {
		return mapGenres;
	}
	public void setMapGenres(Map<Long,Genre> mapGenres) {
		this.mapGenres = mapGenres;
	}
	
	
}
