package fr.adaming.view;

import java.util.Date;


import fr.adaming.exceptions.NombreClientOutOfBoundsException;
import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;
import fr.adaming.service.ClientServiceImpl;
import fr.adaming.service.ConseillerServiceImpl;
import fr.adaming.service.IClientService;
import fr.adaming.service.IConseillerService;

public class ClassTest {
	public static void main(String args[]){
		//pour utiliser les methodes ConseillerServiceImpl je dois instancier un objet de ce type
		IConseillerService conseillerService=new ConseillerServiceImpl();
		
		//pour utiliser les methodes ConseillerServiceImpl je dois instancier un objet de ce type
		IClientService clientService=new ClientServiceImpl();
		
		//1 - Instanciation d'un Conseiller 
			//definir la date de naissance de conseiller 
			Date dncn=new Date(19780126);
		
		Conseiller cn1=new Conseiller("TOTO", "titi", dncn, "Comptabilité", "1234555DF");
		
		// 2 - Ajouter un Conseiller
		conseillerService.ajouterConseillerService(cn1);
		

		// 3- instancier un client 
			//definir la date de naissance de client
			Date dncl=new Date(19901202);
		Client cl1=new Client("BOULMERDJ", "Nomane", dncl, 123456);
		
		//4 Ajouter le client dans la base de données
		clientService.ajouterClientService(cl1);

		
		// 5 atribuer le client 
		 
		//5.1 pour atribuer un client à un conseiller je doit cherhcer d'abord le conseiller par son ID
		Conseiller cn2=conseillerService.getConseillerByIdService(1);
		
		//5.2 appeler la methode atribuerClientToConseillerService de clientService et je dois traiter l'exception que leve cette methode
		try {
			clientService.atribuerClientToConseillerService(cl1, cn2);
		} catch (NombreClientOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
