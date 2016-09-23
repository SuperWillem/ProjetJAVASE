package fr.adaming.model;

import java.util.Date;

public abstract class Carte {
private long nCarte;
private Date dExcper;
private int pin;

//transormer la composition entre le compteCourant et la carte
private CompteCourant cc;
/**
 * 
 */
public Carte() {
	super();
}
/**
 * @param nCarte
 * @param dExcper
 * @param pin
 */
public Carte(long nCarte, Date dExcper, int pin) {
	super();
	this.nCarte = nCarte;
	this.dExcper = dExcper;
	this.pin = pin;
}
/**
 * @return the nCarte
 */
public long getnCarte() {
	return nCarte;
}
/**
 * @param nCarte the nCarte to set
 */
public void setnCarte(long nCarte) {
	this.nCarte = nCarte;
}
/**
 * @return the dExcper
 */
public Date getdExcper() {
	return dExcper;
}
/**
 * @param dExcper the dExcper to set
 */
public void setdExcper(Date dExcper) {
	this.dExcper = dExcper;
}
/**
 * @return the pin
 */
public int getPin() {
	return pin;
}
/**
 * @param pin the pin to set
 */
public void setPin(int pin) {
	this.pin = pin;
}




}
