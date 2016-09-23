package fr.adaming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conseiller extends Personne{
private int id;
private String service;
private String immatriculation;


//transormer l'agregation entre le conseiller et le gerant
	private Gerant gernat;
	
//transormer l'agregation entre le conseiller et le gerant
		private List<Client> listeClients=new ArrayList<Client>();
/**
 * 
 */
public Conseiller() {
	super();
}
/**
 * @param nom
 * @param prenom
 * @param dn
 * @param service
 * @param immatriculation
 */
public Conseiller(String nom, String prenom, Date dn, String service,
		String immatriculation) {
	super(nom, prenom, dn);
	this.service = service;
	this.immatriculation = immatriculation;
}
/**
 * @param nom
 * @param prenom
 * @param dn
 * @param id
 * @param service
 * @param immatriculation
 */
public Conseiller(String nom, String prenom, Date dn, int id, String service,
		String immatriculation) {
	super(nom, prenom, dn);
	this.id = id;
	this.service = service;
	this.immatriculation = immatriculation;
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
 * @return the service
 */
public String getService() {
	return service;
}
/**
 * @param service the service to set
 */
public void setService(String service) {
	this.service = service;
}
/**
 * @return the immatriculation
 */
public String getImmatriculation() {
	return immatriculation;
}
/**
 * @param immatriculation the immatriculation to set
 */
public void setImmatriculation(String immatriculation) {
	this.immatriculation = immatriculation;
}


/**
 * @return the gernat
 */
public Gerant getGernat() {
	return gernat;
}
/**
 * @param gernat the gernat to set
 */
public void setGernat(Gerant gernat) {
	this.gernat = gernat;
}




/**
 * @return the listeClients
 */
public List<Client> getListeClients() {
	return listeClients;
}
/**
 * @param listeClients the listeClients to set
 */
public void setListeClients(List<Client> listeClients) {
	this.listeClients = listeClients;
}



/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Conseiller [" + super.toString()+ ", service=" + service
			+ ", immatriculation=" + immatriculation + "]";
}



}
