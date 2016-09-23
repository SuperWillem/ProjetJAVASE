package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.ClientDaoImpl;
import fr.adaming.dao.IClientDao;
import fr.adaming.exceptions.NombreClientOutOfBoundsException;
import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

public class ClientServiceImpl implements IClientService {

	IClientDao clientDao=new ClientDaoImpl();
	
	@Override
	public void ajouterClientService(Client cl) {
		clientDao.ajouterClient(cl);

	}

	@Override
	public void miseAJourClientService(Client cl) {
		clientDao.miseAJourClient(cl);

	}

	@Override
	public void supprimerClientService(Client cl) {
		clientDao.supprimer(cl);

	}

	@Override
	public List<Client> getAllClientsService() {
		
		return clientDao.getAllClients();
	}

	@Override
	public Client getClientByIdService(int id_cl) {
		return clientDao.getClientById(id_cl);
	}

	@Override
	public List<Client> getClientsByIdConseillerService(int id_conseiller) {
		return clientDao.getClientsByIdConseiller(id_conseiller);
	}

	@Override
	public void atribuerClientToConseillerService(Client cl, Conseiller cn) throws NombreClientOutOfBoundsException {

		//1 cherhcer le nombre des client d'un conseiller
		List<Client> listeClientsConseiller=clientDao.getClientsByIdConseiller(cn.getId());
		
		if (listeClientsConseiller.size()<10){
			System.out.println("le conseiller peut avoir des clients en plus");
			//appeler la methode atribuerClientToConseiller de ClientDaoImpl
			clientDao.atribuerClientToConseiller(cl, cn);
		}else {
			System.out.println("le conseiller a 10 client, il ne peut pas avoir des clients en plus");
			
			//lever une exception personnelle elle est dans le package fr.adaming.exceptions
			throw new NombreClientOutOfBoundsException("le conseiller a 10 client, il ne peut pas avoir des clients en plus");
		}
		
	}

}
