import application.domaine.Tache;
import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;
import application.services.TacheService;
import application.services.UtilisateurService;

void main() {
	UtilisateurRepository utilisateurRepository = new UtilisateurRepository();

	TacheService taches = new TacheService();
	UtilisateurService utilisateurs = new UtilisateurService();



	//Placez vos appels de méthodes ici
	IO.println(utilisateurs.creerUtilisateur("Oceane","Edde"));
	IO.println(utilisateurs.rechercherParId("jdupont"));
}
