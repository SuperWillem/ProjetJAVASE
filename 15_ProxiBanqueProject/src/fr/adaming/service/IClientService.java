package fr.adaming.service;

import java.util.List;

import fr.adaming.exceptions.NombreClientOutOfBoundsException;
import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

public interface IClientService {

	public void ajouterClientService(Client cl);
	
	public void miseAJourClientService(Client cl);
	
	public void supprimerClientService(Client cl);
	
	public List<Client> getAllClientsService();
	
	public Client getClientByIdService(int id_cl);
	
	public List<Client> getClientsByIdConseillerService(int id_conseiller);
	
	public void atribuerClientToConseillerService(Client cl,Conseiller cn) throws NombreClientOutOfBoundsException;
}
