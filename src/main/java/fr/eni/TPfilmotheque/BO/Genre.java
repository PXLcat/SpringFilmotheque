package fr.eni.TPfilmotheque.BO;

public class Genre {

	private Integer id;
	private String libelle;

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Genre(String libelle, Integer id) {
		super();
		this.libelle = libelle;
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	
	
}
