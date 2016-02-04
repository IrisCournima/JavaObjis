package metier;

public class Client extends Personne{
//Constructeurs
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, String civilite, String email) {
		super(nom, prenom, civilite, email);
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public Client(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	//Méthodes
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", civilite=" + civilite + ", email=" + email + "]";
	}
	
	

}
