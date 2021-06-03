package BO;

import java.util.Date;

public class Membre {

	private boolean estAdmin;
	private String id;
	private String pseudo;
	private String motDePasse;
	private Date dateNaissance;
	private Date dateInscription;
	
	
	
	public boolean isEstAdmin() {
		return estAdmin;
	}
	public void setEstAdmin(boolean estAdmin) {
		this.estAdmin = estAdmin;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}

	
}
