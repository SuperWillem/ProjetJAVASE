package fr.adaming.model;

import java.util.Date;

public class CompteCourant extends Compte{

	private int id;
	private long decouvert;
	
	//transormer la compotision entre le client et le compteCourant
	private Client client;

	//transormer la composition entre le compteCourant et la VisaElectron
	private VisaElectron ve;
	

	//transormer la composition entre le compteCourant et la VisaPremium
	private VisaPremium vp;

	/**
	 * 
	 */
	public CompteCourant() {
		super();
		this.ve=new VisaElectron();
		this.vp=new VisaPremium ();
	}

	/**
	 * @param nCompte
	 * @param solde
	 * @param dCreation
	 * @param decouvert
	 */
	public CompteCourant(long nCompte, double solde, Date dCreation,
			long decouvert) {
		super(nCompte, solde, dCreation);
		this.decouvert = decouvert;
		this.ve=new VisaElectron();
		this.vp=new VisaPremium ();
	}

	/**
	 * @param nCompte
	 * @param solde
	 * @param dCreation
	 * @param id
	 * @param decouvert
	 */
	public CompteCourant(long nCompte, double solde, Date dCreation, int id,
			long decouvert) {
		super(nCompte, solde, dCreation);
		this.id = id;
		this.decouvert = decouvert;
		this.ve=new VisaElectron();
		this.vp=new VisaPremium ();
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
	 * @return the decouvert
	 */
	public long getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(long decouvert) {
		this.decouvert = decouvert;
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

	/**
	 * @return the ve
	 */
	public VisaElectron getVe() {
		return ve;
	}

	/**
	 * @param ve the ve to set
	 */
	public void setVe(VisaElectron ve) {
		this.ve = ve;
	}

	/**
	 * @return the vp
	 */
	public VisaPremium getVp() {
		return vp;
	}

	/**
	 * @param vp the vp to set
	 */
	public void setVp(VisaPremium vp) {
		this.vp = vp;
	}
	
	
	
}
