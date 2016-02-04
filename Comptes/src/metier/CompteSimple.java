package metier;

public class CompteSimple extends Compte{
	private float decouvert;
	
	
	
//geters&setters
	public float getDecouvert() {
		return decouvert;
	}



	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}
	
//Constructor
	public CompteSimple(float soldeInitial, float decouvert) {
		super(soldeInitial);
		this.decouvert = decouvert;
	}



	//Méthodes
	@Override
	public String toString() {
		return "CompteSimple [solde=" + solde + "]";
	}



	@Override
	public void retirer(float mt) {
		if (this.solde -mt <this.decouvert) {
			System.out.println("[ERROR] Solde insuffisant");
		}else {
			super.retirer(mt);
		}
		
	}

	



	

}
