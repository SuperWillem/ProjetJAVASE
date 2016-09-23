package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

public interface IClientDao {

	public void ajouterClient(Client cl);
	
	public void miseAJourClient(Client cl);
	
	public void supprimer(Client cl);
	
	public List<Client> getAllClients();
	
	public Client getClientById(int id_cl);
	
	public List<Client> getClientsByIdConseiller(int id_conseiller);
	
	public void atribuerClientToConseiller(Client cl,Conseiller cn);
	
}
