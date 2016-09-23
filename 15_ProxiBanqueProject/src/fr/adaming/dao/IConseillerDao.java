package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Conseiller;



public interface IConseillerDao {

	public void ajouterConseillerDao(Conseiller cn);
	
	public void miseAJourConseillerDao(Conseiller cn);
	
	public void supprimerConseillerDao(Conseiller cn);
	
	public List<Conseiller> getAllConseillersDao();
	
	public Conseiller getConseillerByIdDao(int id_cn);
	
	
}
