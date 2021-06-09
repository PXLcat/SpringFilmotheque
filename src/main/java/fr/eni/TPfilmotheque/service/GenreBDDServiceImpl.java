package fr.eni.TPfilmotheque.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.TPfilmotheque.BO.Genre;
import fr.eni.TPfilmotheque.dao.GenreRepository;

@Service
public class GenreBDDServiceImpl implements GenreService {

	private GenreRepository genreRepository;
	
	private List<Genre> listeGenres;
	private Map<Long,Genre> mapGenres;
	
	public ArrayList<Genre> initListeGenre(){
		return new ArrayList<Genre>();
	}
	
	@Autowired
	public GenreBDDServiceImpl(GenreRepository genreRepository) {
	this.genreRepository = genreRepository;
	}
	
	
//	public List<Genre> getListeGenres() {
//		return listeGenres;
//	}
	public void setListeGenres(List<Genre> listeGenres) {
		this.listeGenres = listeGenres;
	}
	public Map<Long,Genre> getMapGenres() {
		return mapGenres;
	}
	public void setMapGenres(Map<Long,Genre> mapGenres) {
		this.mapGenres = mapGenres;
	}

	@Override
	public void ajouterGenre(Genre genre) {
		genreRepository.save(genre);
		
	}

	@Override
	public List<Genre> getListeGenres() {
		List<Genre> genres = genreRepository.findAll();
		
		//___remplir mapGenre sinon on peut pas le récup pour l'enregistrer en BDD
		mapGenres = new HashMap<Long, Genre>();
		genres.forEach(m -> mapGenres.put(m.getId(), m));		
		//___
		
		return genres;
	}
	
	//Au lieu de service, implémentation
	

	

	
	
	
}
