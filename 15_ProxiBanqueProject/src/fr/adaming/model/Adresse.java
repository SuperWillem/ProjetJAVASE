package fr.adaming.model;

public class Adresse {
	
private int id;
private String rue;
private int cPostal;
/**
 * 
 */
public Adresse() {
	super();
}
/**
 * @param rue
 * @param cPostal
 */
public Adresse(String rue, int cPostal) {
	super();
	this.rue = rue;
	this.cPostal = cPostal;
}
/**
 * @param id
 * @param rue
 * @param cPostal
 */
public Adresse(int id, String rue, int cPostal) {
	super();
	this.id = id;
	this.rue = rue;
	this.cPostal = cPostal;
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
 * @return the rue
 */
public String getRue() {
	return rue;
}
/**
 * @param rue the rue to set
 */
public void setRue(String rue) {
	this.rue = rue;
}
/**
 * @return the cPostal
 */
public int getcPostal() {
	return cPostal;
}
/**
 * @param cPostal the cPostal to set
 */
public void setcPostal(int cPostal) {
	this.cPostal = cPostal;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Adresse [rue=" + rue + ", cPostal=" + cPostal + "]";
}


}
