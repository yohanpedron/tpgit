package application.services;

import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;
import java.util.Optional;

public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;

	public UtilisateurService() {

		utilisateurRepository = new UtilisateurRepository();
	}

    public String creerUtilisateur(String prenom, String nom) {
        String identifiant = (prenom.charAt(0) + nom).toLowerCase();
        String courriel = (prenom + "." + nom + "@mail.com").toLowerCase();

        Utilisateur nouvelUtilisateur = new Utilisateur(identifiant, nom , prenom, courriel);
        return nouvelUtilisateur.getIdentifiant();
    }

	public Utilisateur rechercherParId(String identifiant){
		return utilisateurRepository.getUtilisateurs().stream().filter(element -> identifiant.equals(element.getIdentifiant())).findAny().orElseThrow(() -> new RuntimeException("Cet utilisateur n'existe pas."));
	}

}
