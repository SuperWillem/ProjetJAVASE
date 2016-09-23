package fr.adaming.model;

import java.util.Date;

public class Client extends Personne{
private int id;
private int nClient;

//transormer l'association entre le client et l'adresse
private Adresse adresse;


////transormer l'agregation entre le conseiller et le client
private Conseiller conseiller;

//transormer la compotision entre le client et le compteEpargne
private CompteEpargne ce;

//transormer la compotision entre le client et le compteCourant
private CompteCourant cc;



/**
 * 
 */
public Client() {
	super();
	this.ce=new CompteEpargne();//a cause de la composition
	this.cc=new CompteCourant();//a cause de la composition
}




/**
 * @param nom
 * @param prenom
 * @param dn
 * @param nClient
 */
public Client(String nom, String prenom, Date dn, int nClient) {
	super(nom, prenom, dn);
	this.nClient = nClient;
	this.ce=new CompteEpargne();//a cause de la composition
	this.cc=new CompteCourant();//a cause de la composition
}








/**
 * @param nom
 * @param prenom
 * @param dn
 * @param id
 * @param nClient
 */
public Client(int id,String nom, String prenom, Date dn,  int nClient) {
	super(nom, prenom, dn);
	this.id = id;
	this.nClient = nClient;
	this.ce=new CompteEpargne();//a cause de la composition
	this.cc=new CompteCourant();//a cause de la composition
}




/**
 * @return the ce
 */
public CompteEpargne getCe() {
	return ce;
}




/**
 * @param ce the ce to set
 */
public void setCe(CompteEpargne ce) {
	this.ce = ce;
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
 * @return the nClient
 */
public int getnClient() {
	return nClient;
}


/**
 * @param nClient the nClient to set
 */
public void setnClient(int nClient) {
	this.nClient = nClient;
}


/**
 * @return the adresse
 */
public Adresse getAdresse() {
	return adresse;
}


/**
 * @param adresse the adresse to set
 */
public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}


/**
 * @return the conseiller
 */
public Conseiller getConseiller() {
	return conseiller;
}


/**
 * @param conseiller the conseiller to set
 */
public void setConseiller(Conseiller conseiller) {
	this.conseiller = conseiller;
}


/**
 * @return the cc
 */
public CompteCourant getCc() {
	return cc;
}


/**
 * @param cc the cc to set
 */
public void setCc(CompteCourant cc) {
	this.cc = cc;
}





}
