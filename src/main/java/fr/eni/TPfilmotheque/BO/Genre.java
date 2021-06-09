package fr.eni.TPfilmotheque.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {

	//ajouté pour lien avec la BDD
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	private String libelle;

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Genre(String libelle/*, Long id*/) {
		super();
		this.libelle = libelle;
		//this.id = id;
	}
	
	public Genre() {
		super();

	}

	public String getLibelle() {
		return libelle;
	}

	
	
}
