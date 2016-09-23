package fr.adaming.model;

import java.util.Date;

public class VisaElectron extends Carte{
	private int id;
	private long plafond;
	

	/**
	 * 
	 */
	public VisaElectron() {
		super();
	}



	/**
	 * @param nCarte
	 * @param dExcper
	 * @param pin
	 * @param plafond
	 */
	public VisaElectron(long nCarte, Date dExcper, int pin, long plafond) {
		super(nCarte, dExcper, pin);
		this.plafond = plafond;
	}



	/**
	 * @param nCarte
	 * @param dExcper
	 * @param pin
	 * @param id
	 * @param plafond
	 */
	public VisaElectron(int id,long nCarte, Date dExcper, int pin,  long plafond) {
		super(nCarte, dExcper, pin);
		this.id = id;
		this.plafond = plafond;
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
	 * @return the plafond
	 */
	public long getPlafond() {
		return plafond;
	}



	/**
	 * @param plafond the plafond to set
	 */
	public void setPlafond(long plafond) {
		this.plafond = plafond;
	}


	
	
	
	

}
