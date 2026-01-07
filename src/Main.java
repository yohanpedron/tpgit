import application.domaine.Tache;
import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;
import application.services.TacheService;
import application.services.UtilisateurService;

void main() {

	TacheService taches = new TacheService();
	UtilisateurService utilisateurs = new UtilisateurService();

	//Creer un utilisateur
	utilisateurs.creerUtilisateur("oceane","edde");
	utilisateurs.creerUtilisateur("yohan","pedron");


	//Rechercher utilisateur par ID
	IO.println(utilisateurs.rechercherParId("jdupont"));

	//Afficher tous les utilisateurs
	utilisateurs.rechercherTous();

}
