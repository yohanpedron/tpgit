package application.services;

import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

import java.util.Optional;

public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;

	public UtilisateurService() {
		utilisateurRepository = new UtilisateurRepository();
	}

	public Utilisateur rechercherParId(String identifiant){
		return utilisateurRepository.getUtilisateurs().stream().filter(element -> identifiant.equals(element.getIdentifiant())).findAny().orElseThrow(() -> new RuntimeException("Cet utilisateur n'existe pas."));
	}

}
