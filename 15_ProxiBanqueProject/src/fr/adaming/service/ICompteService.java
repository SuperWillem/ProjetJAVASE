package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Compte;

public interface ICompteService<T extends Compte> {
	
	public void ajouterCompteDao(T compte);

	public void miseAJourCompteDao(T compte);

	public void supprimerCompteDao(T compte);

	public List<T> getAllCompteDao();

	public T getCompteByIdDao(int id_cn);

	public List<T> getComptesByIdCclientDao(int id_client);

	public void virementDao(T compe1, T compte1, double somme);

	public void retraitDao(T compte, double somme);
}
