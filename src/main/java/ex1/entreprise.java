package ex1;

import java.util.Date;

public class Entreprise {
	
	
	@Override
	public String toString() {
		return "Entreprise [siret=" + siret + ", nom=" + nom + ", adresse=" + adresse + ", dateCreation=" + dateCreation
				+ "]";
	}

	protected int siret;
	protected String nom;
	protected String adresse;
	protected Date dateCreation;

	public static final int CAPITAL_MAX = 3000000;
	
	public void afficherStatut(){
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * 
	 * @param siret
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * @return
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * 
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * 
	 * @return
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	
	/**
	 * 
	 * @param dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * 
	 * @return
	 */

	
}
