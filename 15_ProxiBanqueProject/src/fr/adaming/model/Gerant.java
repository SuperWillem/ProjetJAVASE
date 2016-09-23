package fr.adaming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gerant extends Conseiller{
	private int id;
	private int nBureau;
	
	//transormer l'agregation entre le conseiller et le gerant
	private List<Conseiller> listeConselliers=new ArrayList<Conseiller>();
	
	//transormer l'agregation entre l'agence et le gerant
	private Agence agence;
	
	/**
	 * 
	 */
	public Gerant() {
		super();
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param dn
	 * @param id
	 * @param service
	 * @param immatriculation
	 * @param id2
	 * @param nBureau
	 */
	public Gerant(String nom, String prenom, Date dn, String service,
			String immatriculation, int nBureau) {
		super(nom, prenom, dn, service, immatriculation);
		this.nBureau = nBureau;
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param dn
	 * @param id
	 * @param service
	 * @param immatriculation
	 * @param id2
	 * @param nBureau
	 */
	public Gerant(int id,String nom, String prenom, Date dn,  String service,String immatriculation, int nBureau) {
		super(nom, prenom, dn,service, immatriculation);
		this.id = id;
		this.nBureau = nBureau;
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
	 * @return the nBureau
	 */
	public int getnBureau() {
		return nBureau;
	}
	/**
	 * @param nBureau the nBureau to set
	 */
	public void setnBureau(int nBureau) {
		this.nBureau = nBureau;
	}
	/**
	 * @return the listeConselliers
	 */
	public List<Conseiller> getListeConselliers() {
		return listeConselliers;
	}
	/**
	 * @param listeConselliers the listeConselliers to set
	 */
	public void setListeConselliers(List<Conseiller> listeConselliers) {
		this.listeConselliers = listeConselliers;
	}
	
	/**
	 * @return the agence
	 */
	public Agence getAgence() {
		return agence;
	}
	/**
	 * @param agence the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gerant ["+super.toString()+ ", nBureau=" + nBureau + "]";
	}

	
	
}
