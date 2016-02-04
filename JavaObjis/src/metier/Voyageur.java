package metier;

public class Voyageur extends Personne{
	// attributs
	private int age;
	private String pieceIdentite;
	
	// getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPieceIdentite() {
		return pieceIdentite;
	}
	public void setPieceIdentite(String pieceIdentite) {
		this.pieceIdentite = pieceIdentite;
	}
	public Voyageur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voyageur(String nom, String prenom, String civilite, String email) {
		super(nom, prenom, civilite, email);
		// TODO Auto-generated constructor stub
	}
	public Voyageur(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}
	public Voyageur(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	public Voyageur(int age, String pieceIdentite) {
		super();
		this.age = age;
		this.pieceIdentite = pieceIdentite;
	}
	
	// Méthodes
	@Override
	public String toString() {
		return "Voyageur [age=" + age + ", pieceIdentite=" + pieceIdentite + ", nom=" + nom + ", prenom=" + prenom
				+ ", civilite=" + civilite + ", email=" + email + "]";
	}
	
	
}
