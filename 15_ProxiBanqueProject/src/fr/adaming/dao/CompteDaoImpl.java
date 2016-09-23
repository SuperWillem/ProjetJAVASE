package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Compte;

public class CompteDaoImpl<T extends Compte> implements ICompteDao<T> {

	@Override
	public void ajouterCompteDao(T compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void miseAJourCompteDao(T compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCompteDao(T compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> getAllCompteDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getCompteByIdDao(int id_cn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getComptesByIdCclientDao(int id_client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void virementDao(T compe1, T compte1, double somme) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retraitDao(T compte, double somme) {
		
	}

}
