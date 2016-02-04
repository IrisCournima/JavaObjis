package display;
/**
 * 
 * @author niniachel
 * @version 1.0
 */
import java.util.Scanner;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;
/**
 * 
 * @author niniachel
 *
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		float montant = 0;
		Compte compteActuel = new Compte();
		CompteSimple cptS = new CompteSimple(1000,-200);
		CompteEpargne cptE = new CompteEpargne(5000,10);
		ComptePayant cptP = new ComptePayant(1000);
		int choix = 0;
		
		while (choix !=4) {
			System.out.println("Quel compte souhaitez-vous voir?\n 1 pour Compte Simple \n 2 pour COmpte Epargne \n 3 Pour compte payant");
			choix = sc.nextInt();
			if (choix == 1) {
				compteActuel = cptS;
			}else if (choix == 2) {
				compteActuel = cptE;
			}else if (choix == 3) {
				compteActuel = cptP;
			}else if (choix <1 || choix >4) {
				System.out.println("[ERROR] choix invalide");
			}
			
				while (choix != 4) {
					System.out.println("Vous êtes sur " +compteActuel);
					System.out.println("Pour retirer appuyer sur 1\n Pour verser de l'argent appuyer sur 2"
							+ "\n POur calculer vôtre taux appuyer sur 3\n pour quitter appuyer sur 4");
					choix = sc.nextInt();

					if (choix == 1) {
						System.out.println("Solde actuel " + compteActuel);
						System.out.println("Combien souhaitez-vous retirer? ");
						montant = sc.nextFloat();
						float test = montant - compteActuel.getSolde();
						if (test > -500) {
							System.out.println("[ERROR]: solde maximal dépassé");
						} else {
							compteActuel.retirer(montant);
						}

					} else if (choix == 2) {
						System.out.println("Solde actuel " + compteActuel);
						System.out.println("Combien souhaitez vous verser? ");

						montant = sc.nextFloat();
						compteActuel.verser(montant);
					} else if (choix == 3) {
						if (compteActuel == cptE) {
							cptE.calculInterets();
						}else {
							System.out.println("Vôtre compte ne permet pas cette opération");
						}
					} else if (choix <1 || choix >4){
						System.out.println("[ERROR] choix invalide");
					}

				}
				
		}
		
		System.out.println("Bye");
//
	}

}
