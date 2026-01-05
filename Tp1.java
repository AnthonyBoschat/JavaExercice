import java.util.Scanner;

public class Tp1 {

	// Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
	private static Scanner scanner;

	// Méthode principale
	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		// Appel de la méthode de l'exercice 1.1
		exercice1_1();

		scanner.close();
	}

	// Méthode de l'exercice n°1.1
	public static void exercice1_1() {
		String prenom;
		String nom;
		String age;

		System.out.print("Prénom : ");
		prenom = scanner.next();

		System.out.print("Nom : ");
		nom = scanner.next();

		System.out.print("Age : ");
		age = scanner.next();

		System.out.printf("Bonjour %s %s (%s ans)%n", prenom, nom, age);
	}

	// Méthode de l'exercice n°1.2 
	public static void exercice1_2() {
		// ...
	}

}
