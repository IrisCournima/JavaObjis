package metier;

public class ComptePayant extends Compte {

	// attribut

	// Constructors
	public ComptePayant(float soldeInitial) {
		super(soldeInitial);
		// TODO Auto-generated constructor stub
	}

	// Méthodes
	@Override
	public String toString() {
		return "ComptePayant [solde=" + solde + "]";
	}

	@Override
	public void retirer(float mt) {
		mt = frais(mt);
		super.retirer(mt);
	}

	@Override
	public void verser(float mt) {
		mt = frais(mt);
		super.verser(mt);
	}

	public float frais(float mt) {
		float frais = 0;
		float newMt = 0;
		frais = (mt * 5) / 100;
		newMt = (mt - frais);
		return newMt;

	}

}
