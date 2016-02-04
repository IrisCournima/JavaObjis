package metier;
/**
 * 
 * @author niniachel
 * @version 1.0
 */
public class Compte {

	// attributs
	private int code;
	protected float solde;
	private int nbComptes;

	// constructeur
	public Compte(float soldeInitial) {
		super();
		this.solde = soldeInitial;
	}

	public Compte() {
		// TODO Auto-generated constructor stub
	}

	// getter setters
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public int getNbComptes() {
		return nbComptes;
	}

	public void setNbComptes(int nbComptes) {
		this.nbComptes = nbComptes;
	}
	
	// méthodes
	/**
	 * retirer: soustraire une somme du solde
	 * @param mt
	 */
	public void retirer(float mt) {
		if (mt < 0) {
			System.out.println("[ERROR]:erreur de montant, montant négatif");
		}else{
			this.solde -= mt;
		}
		
	}

	/**
	 * verser: ajouter une somme au solde
	 * @param mt
	 */
	public void verser(float mt) {
		if (mt<0) {
			System.out.println("[ERROR]:erreur de montant, montant négatif");
		}else {
			this.solde += mt;
		}
	}

	@Override
	public String toString() {
		return "Comptes [solde=" + solde + "]";
	}



	

}
