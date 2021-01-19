
import java.util.Scanner;

public class Shooter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choix;

		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println("Combien de shooters sans alcool souhaitez vous boire?? ");
				System.out.println("");
				int nombreshooter = scanner.nextInt();

				if (nombreshooter >= 0 && nombreshooter <= 99) {
					chanter(nombreshooter);
				} else {
					System.out.println("Le nombre de shooter accepté doit être compris entre 0 et 99. ");
				}
				System.out.println("");
				System.out.println("Tapez O si vous souhaiter recommencer. ");
				choix = scanner.next();

				System.out.println("");

			} while (choix.equalsIgnoreCase("O"));
		}

	}// fin du main

	public static void chanter(int nombreshooter) {
		for (int compteur = nombreshooter; compteur > 0; --compteur) {
			if (compteur > 1) {
				System.out
						.println(compteur + " shooters sans alcool sur le mur, " + compteur + " shooters sans alcool.");
				System.out.println("Bois en un et au suivant! " + (compteur - 1) + " shooters sans alcool sur le mur.");
				System.out.println("");
			} else {
				System.out.println(compteur + " shooter sans alcool sur le mur, " + compteur + " shooter sans alcool.");
				System.out.println("Bois en un et au suivant! Plus de shooters sans alcool sur le mur.");
				System.out.println("");
			}
		}

		System.out.println("Plus de shooters sans alcool sur le mur, plus de shooters sans alcool. ");
		System.out
				.println("Vas au supermarché pour en acheter, " + nombreshooter + " shooters sans alcool sur le mur. ");

	}
}
