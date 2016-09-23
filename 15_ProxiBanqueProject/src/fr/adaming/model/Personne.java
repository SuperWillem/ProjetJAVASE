package fr.adaming.model;

import java.util.Date;

public abstract class Personne {
	private String nom;
	private String prenom;
	private Date dn;

	/**
 * 
 */
	public Personne() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param dn
	 */
	public Personne(String nom, String prenom, Date dn) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dn = dn;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dn
	 */
	public Date getDn() {
		return dn;
	}

	/**
	 * @param dn
	 *            the dn to set
	 */
	public void setDn(Date dn) {
		this.dn = dn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dn=" + dn
				+ "]";
	}

}
