package fr.adaming.model;

import java.util.Date;

public class VisaPremium extends Carte{
private int id;
private String assurance;
/**
 * 
 */
public VisaPremium() {
	super();
}
/**
 * @param nCarte
 * @param dExcper
 * @param pin
 * @param assurance
 */
public VisaPremium(long nCarte, Date dExcper, int pin, String assurance) {
	super(nCarte, dExcper, pin);
	this.assurance = assurance;
}
/**
 * @param nCarte
 * @param dExcper
 * @param pin
 * @param id
 * @param assurance
 */
public VisaPremium(long nCarte, Date dExcper, int pin, int id, String assurance) {
	super(nCarte, dExcper, pin);
	this.id = id;
	this.assurance = assurance;
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
 * @return the assurance
 */
public String getAssurance() {
	return assurance;
}
/**
 * @param assurance the assurance to set
 */
public void setAssurance(String assurance) {
	this.assurance = assurance;
}



}
