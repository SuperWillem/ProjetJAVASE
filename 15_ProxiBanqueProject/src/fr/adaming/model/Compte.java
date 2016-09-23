package fr.adaming.model;

import java.util.Date;

public abstract class Compte {
private long nCompte;
private double solde;
private Date dCreation;
/**
 * 
 */
public Compte() {
	super();
}
/**
 * @param nCompte
 * @param solde
 * @param dCreation
 */
public Compte(long nCompte, double solde, Date dCreation) {
	super();
	this.nCompte = nCompte;
	this.solde = solde;
	this.dCreation = dCreation;
}
/**
 * @return the nCompte
 */
public long getnCompte() {
	return nCompte;
}
/**
 * @param nCompte the nCompte to set
 */
public void setnCompte(long nCompte) {
	this.nCompte = nCompte;
}
/**
 * @return the solde
 */
public double getSolde() {
	return solde;
}
/**
 * @param solde the solde to set
 */
public void setSolde(double solde) {
	this.solde = solde;
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


	
}
