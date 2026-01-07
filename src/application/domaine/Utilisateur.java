package application.domaine;

public class Utilisateur {
	private String identifiant;
	private String nom;
	private String prenom;
	private String courriel;

	public Utilisateur(String identifiant, String nom, String prenom, String courriel) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.courriel = courriel;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getCourriel() {
		return courriel;
	}

	@Override
	public String toString() {
		return "Utilisateur{" +
				"identifiant='" + identifiant + '\'' +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", courriel='" + courriel + '\'' +
				'}';
	}
}
