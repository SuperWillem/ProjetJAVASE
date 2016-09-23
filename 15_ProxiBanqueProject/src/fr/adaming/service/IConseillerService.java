package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Conseiller;

public interface IConseillerService {

	public void ajouterConseillerService(Conseiller cn);
	
	public void miseAJourConseillerService(Conseiller cn);
	
	public void supprimerConseillerService(Conseiller cn);
	
	public List<Conseiller> getAllConseillersService();
	
	public Conseiller getConseillerByIdService(int id_cn);
	
}
