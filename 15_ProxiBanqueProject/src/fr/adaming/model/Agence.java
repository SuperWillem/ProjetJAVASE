package fr.adaming.model;

import java.util.Date;

public class Agence {

	private int id;
	private String nom;
	private Date dCreation;
	private Gerant gerant;
	
	/**
	 * 
	 */
	public Agence() {
		super();
	}
	/**
	 * @param nom
	 * @param dCreation
	 */
	public Agence(String nom, Date dCreation) {
		super();
		this.nom = nom;
		this.dCreation = dCreation;
	}
	/**
	 * @param id
	 * @param nom
	 * @param dCreation
	 */
	public Agence(int id, String nom, Date dCreation) {
		super();
		this.id = id;
		this.nom = nom;
		this.dCreation = dCreation;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the dCreation
	 */
	public Date getdCreation() {
		return dCreation;
	}
	/**
	 * @param dCreation the dCreation to set
	 */
	public void setdCreation(Date dCreation) {
		this.dCreation = dCreation;
	}
	
	
	/**
	 * @return the gerant
	 */
	public Gerant getGerant() {
		return gerant;
	}
	/**
	 * @param gerant the gerant to set
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agence ["+ ", nom=" + nom + ", dCreation=" + dCreation
				+ "]";
	}
	
	
}