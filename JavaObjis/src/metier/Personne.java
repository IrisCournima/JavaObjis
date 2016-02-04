package metier;

public class Personne {

	// attributs
	protected String nom;
	protected String prenom;
	protected String civilite;
	protected String email;


	// constructor
	public Personne() {

	}

	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}



	// getters and setters
	 public String getNom() {
	 return nom;
	 }
	
	 public void setNom(String nom) {
	 this.nom = nom;
	 }
	
	 public String getPrenom() {
	 return prenom;
	 }
	
	 public void setPrenom(String prenom) {
	 this.prenom = prenom;
	 }
	
	 public String getCivilite() {
	 return civilite;
	 }
	
	 public void setCivilite(String civilite) {
	 this.civilite = civilite;
	 }
	
	 public String getEmail() {
	 return email;
	 }
	
	 public void setEmail(String email) {
	 this.email = email;
	 }
	
	
	
	
	public Personne(String nom, String prenom, String civilite, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.email = email;
	}

	//méthodes
	@Override
	public String toString() {
		return "Personne [civilite=" + civilite +", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}


}
