package BO;

import java.util.Date;

public class Film {

	private String titre;
	private Date anneeSortie;
	private int duree; //en secondes
	private Genre genreFilm;
	
	public Film() {
		super();

	}
	
	public Film(String titre, Date anneeSortie, int duree, Genre genreFilm) {
		super();
		this.titre = titre;
		this.anneeSortie = anneeSortie;
		this.duree = duree;
		this.genreFilm = genreFilm;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getAnneeSortie() {
		return anneeSortie;
	}
	public void setAnneeSortie(Date anneeSortie) {
		this.anneeSortie = anneeSortie;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Genre getGenreFilm() {
		return genreFilm;
	}
	public void setGenreFilm(Genre genreFilm) {
		this.genreFilm = genreFilm;
	}

}
