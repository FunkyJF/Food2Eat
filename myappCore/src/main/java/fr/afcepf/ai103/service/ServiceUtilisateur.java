package fr.afcepf.ai103.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoUseradresse;
import fr.afcepf.ai103.dao.IDaoUtilisateur;
import fr.afcepf.ai103.data.Useradresse;
import fr.afcepf.ai103.data.Utilisateur;
@Stateless
@Local
public class ServiceUtilisateur implements IServiceUtilisateur {
	
	@EJB
	private IDaoUtilisateur daoUtilisateur;
	
	@EJB
	private IDaoUseradresse daoUseradresse;

	@Override
	public Utilisateur rechercherUtilisateur(String pseudo, String mdp) {
		
		return daoUtilisateur.rechercherUtilisateur(pseudo, mdp);
	}

	@Override
	public Utilisateur authentificationUtilisateur(String pseudo, String mdp) {
		return daoUtilisateur.authentificationUtilisateur(pseudo, mdp);
	}

	@Override
	public List<Utilisateur> rechercherListUtilisateurs(int idUser) {
		return daoUtilisateur.rechercherListUtilisateurs(idUser);
	}

	@Override
	public Utilisateur rechercherUtilisateurParId(int idUtilisateur) {
		return daoUtilisateur.rechercherUtilisateurParId(idUtilisateur);
	}

	@Override
	public Useradresse rechercherAdressePrincipaleUser(int iduser) {
		return daoUseradresse.rechercherAdressePrincipaleUser(iduser);
	}
	
	

}
