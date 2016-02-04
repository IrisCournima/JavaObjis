package metier;

public class CompteEpargne extends Compte {

	// attributs
	private float taux;

	// geters&setters
	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	// Constructor

	public CompteEpargne(float soldeInitial, float taux) {
		super(soldeInitial);
		this.taux = taux;
	}

	// Méthodes
	@Override
	public String toString() {
		return "CompteEpargne [solde=" + solde + "]";
	}

	public void calculInterets() {
		float interets = (this.solde * this.taux) / 100;
		System.out.println(interets);
	}

}
