package fr.eni.TPfilmotheque.BO;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Film {

	//ajouté pour lien avec la BDD
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String titre;
	private int anneeSortie;
	private int duree; //en secondes
	
	@ManyToOne(cascade = CascadeType.DETACH) //pas sûre que ce soit le meilleur type à prendre 
												//mais avec persist il y avait un souci avec le genre (déjà présent dans la BDD)
    @JoinColumn(name = "genre", referencedColumnName = "id")
	private Genre genreFilm;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	


	
	public Film() {
		super();

	}
	
	public Film(String titre, int anneeSortie, int duree, Genre genreFilm) {
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
	public int getAnneeSortie() {
		return anneeSortie;
	}
	public void setAnneeSortie(int anneeSortie) {
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
