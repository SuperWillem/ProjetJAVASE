package fr.adaming.model;

import java.util.Date;

public class CompteEpargne extends Compte {

	private int id;
	private double tRem;
	
	//transormer la compotision entre le client et le compteEpargne
	private Client client;
	
	/**
	 * 
	 */
	public CompteEpargne() {
		super();
	}
	/**
	 * @param nCompte
	 * @param solde
	 * @param dCreation
	 * @param tRem
	 */
	public CompteEpargne(long nCompte, double solde, Date dCreation, double tRem) {
		super(nCompte, solde, dCreation);
		this.tRem = tRem;
	}
	/**
	 * @param nCompte
	 * @param solde
	 * @param dCreation
	 * @param id
	 * @param tRem
	 */
	public CompteEpargne(int id,long nCompte, double solde, Date dCreation,double tRem) {
		super(nCompte, solde, dCreation);
		this.id = id;
		this.tRem = tRem;
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
	 * @return the tRem
	 */
	public double gettRem() {
		return tRem;
	}
	/**
	 * @param tRem the tRem to set
	 */
	public void settRem(double tRem) {
		this.tRem = tRem;
	}
	
	
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne [id=" + id + ", tRem=" + tRem + ", gettRem()=" + gettRem() + "]";
	}
	
	
	
	
	
}
