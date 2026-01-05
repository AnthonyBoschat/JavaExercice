import java.util.Scanner;

public class Tp1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        while (true) {
            printMenu();

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "a", "A" -> runAllExercises();
                case "1" -> exercice1_1();
                case "2" -> exercice1_2();
                case "3" -> exercice2_1();
                case "4" -> exercice2_2();
                case "5" -> exercice3_1();
                case "6" -> exercice4_1();
                case "7" -> exercice4_2();
                case "0" -> {
                    System.out.println("Fin du programme.");
                    return;
                }
                default -> System.out.println("Choix invalide.");
            }

            waitForEnter();
        }
    }

    private static void printMenu() {
        System.out.printf("%n=========================%n");
        System.out.println("TP1 - Menu");
        System.out.println("A - Lancer tous les exercices");
        System.out.println("1 - Lancer exercice 1_1");
        System.out.println("2 - Lancer exercice 1_2");
        System.out.println("3 - Lancer exercice 2_1");
        System.out.println("4 - Lancer exercice 2_2");
        System.out.println("5 - Lancer exercice 3_1");
        System.out.println("6 - Lancer exercice 4_1");
        System.out.println("7 - Lancer exercice 4_2");
        System.out.println("0 - Quitter");
        System.out.printf("%n");
        System.out.print("Votre choix : ");
    }

    private static void waitForEnter() {
        System.out.printf("%n%nAppuyez sur Entrée pour revenir au menu...");
        scanner.nextLine();
    }

    private static void runAllExercises() {
        exercice1_1();
        exercice1_2();
        exercice2_1();
		exercice2_2();
		exercice3_1();
		exercice4_1();
		exercice4_2();
    }

    private static void presentationExercice(String exerciceNumber) {
		System.out.printf("%n%n%n%n");
        System.out.printf("%n---------------------------%n");
        System.out.printf("Démarrage de l'exercice %s%n", exerciceNumber);
        System.out.printf("---------------------------%n%n");
    }


	// Exercices

    private static void exercice1_1() {
        presentationExercice("1_1");
		String first_name;
		String last_name;
		String age;
		int parsed_age;
		
        System.out.print("Prénom : ");
        first_name = scanner.nextLine().trim();

        System.out.print("Nom : ");
        last_name = scanner.nextLine().trim();

		
		while (true) { 
			System.out.print("Age : ");
			age = scanner.nextLine().trim();
			try {
				parsed_age = Integer.parseInt(age);
			} catch (NumberFormatException e) {
				System.out.println("Veuillez saisir un nombre entier.");
				continue;
			}

			if (parsed_age > 0) {
				break;
			}

			System.out.println("L'age doit être supérieur à 0.");
			
		}

		if(parsed_age > 100){
			System.out.printf("%n ➡️  Bonjour %s %s (%s ans, félicitation, vous êtes vieux 👴)%n", first_name, last_name, age);
		}else{
			System.out.printf("%n ➡️  Bonjour %s %s (%s ans)%n", first_name, last_name, age);
		}

		
    }

    private static void exercice1_2() {
        presentationExercice("1_2");
		String value_x;
		String value_y;
		String temp_value;

        System.out.print("Saisir la valeur de x : ");
        value_x = scanner.nextLine().trim();

        System.out.print("Saisir la valeur de y : ");
        value_y = scanner.nextLine().trim();

        temp_value 	= value_x;
        value_x 	= value_y;
        value_y 	= temp_value;

        System.out.printf("➡️  Les valeurs sont permutées, x vaut %s et y vaut %s%n", value_x, value_y);
    }

    private static void exercice2_1() {
        presentationExercice("2_1");
		String first_sentence;
		String second_sentence;

		System.out.print("Saisir un premier mot : ");
		first_sentence = scanner.nextLine().trim();

		System.out.print("Saisir un second mot : ");
		second_sentence = scanner.nextLine().trim();

		if(first_sentence.length() > second_sentence.length()){
			System.out.printf("➡️  '%s' est le mot avec le plus de caractères", first_sentence);
		}else if(second_sentence.length() > first_sentence.length()){
			System.out.printf("➡️  '%s' est le mot avec le plus de caractères", second_sentence);
		}else{
			System.out.printf("➡️  '%s' et '%s' possèdent le même nombre de caractère -> %s caractère(s)", first_sentence, second_sentence, first_sentence.length());
		}
        
    }


    private static void exercice2_2() {
        presentationExercice("2_2");
		String user_year;

		while(true){
			System.out.print("Saisir une année : ");
			user_year = scanner.nextLine().trim();
			int parsed_user_year;
			try {
				parsed_user_year = Integer.parseInt(user_year);
			} catch (NumberFormatException e) {
				System.out.println("Veuillez saisir un année valide (nombre entier)");
				continue;
			}

			if(
				parsed_user_year % 400 == 0 || 
				(parsed_user_year % 4 == 0 && parsed_user_year % 100 != 0)
			){
				System.out.printf("➡️  L'année %s est bissextile", user_year);
			}else{
				System.out.printf("➡️  L'année %s n'est pas bissextile", user_year);
			}
			break;
		}
    }


    private static void exercice3_1() {
        presentationExercice("3_1");

		int max_value 			= 0;
		int number_max_value 	= 0;
		int min_value 			= 100;
		int number_min_value 	= 0;

		for (int i = 0; i < 10; i++) {

			double value_decimal = Math.random() * 101;
			int rand 			 = (int) value_decimal;
			int number_position  = i + 1;

			System.out.printf("➡️  Le nombre %s vaut %s %n", number_position, rand);
			if(rand > max_value){
				max_value = rand;
				number_max_value = number_position;
			}
			if(rand < min_value){
				min_value = rand;
				number_min_value = number_position;
			}
		}


		if(max_value != min_value){
			System.out.printf("➡️  Le maximum vaut %s (numéro %s), et le minimum vaut %s (numéro %s)", max_value, number_max_value, min_value, number_min_value);
		}else{
			System.out.printf("➡️  You'r lucky ! Tout les nombres générer sont les mêmes, le minimum et la maximum valent %s", max_value);
		}
    }






    private static void exercice4_1() {
        presentationExercice("4_1");

		 
		String user_guess;
		double value_decimal = Math.random() * 101;
		int rand 			 = (int) value_decimal;
		int guess_number 	 = 0;
		System.out.printf("(Aide -> Réponse -> %s)%n", rand);

		while(true){
			System.out.println("Entrer un nombre : ");
			user_guess = scanner.nextLine().trim();
			int parsed_user_guess;
			int difference;

			try {
				parsed_user_guess = Integer.parseInt(user_guess);
				guess_number += 1;
			} catch (NumberFormatException e) {
				System.out.println("Veuillez saisir un nombre valide (nombre entier)");
				continue;
			}

			difference = parsed_user_guess > rand ? parsed_user_guess - rand : rand - parsed_user_guess;
			
			if(difference == 0){
				System.out.printf("%n➡️  Victoire ! - %s tentative(s)", guess_number);
				break;
			}
			else if(difference > 20){
				System.out.println("-----> froid");
			}else if(difference >= 6 && difference <= 20 ){
				System.out.println("-----> tiède");
			}else if(difference >= 1 && difference <= 5){
				System.out.println("-----> chaud");
			}

		}

		
    }


    private static void exercice4_2() {
        presentationExercice("4_2");

		String user_guess;
		double value_decimal = Math.random() * 101;
		int rand 			 = (int) value_decimal;
		int guess_number 	 = 0;
		System.out.printf("(Aide -> Réponse -> %s)%n", rand);

		do { 

			System.out.println("Entrer un nombre : ");
			user_guess = scanner.nextLine().trim();
			int parsed_user_guess;
			int difference;

			try {
				parsed_user_guess = Integer.parseInt(user_guess);
				guess_number += 1;
			} catch (NumberFormatException e) {
				System.out.println("Veuillez saisir un nombre valide (nombre entier)");
				continue;
			}

			difference = parsed_user_guess > rand ? parsed_user_guess - rand : rand - parsed_user_guess;
			
			if(difference == 0){
				System.out.printf("➡️  Victoire ! - %s tentative(s)", guess_number);
				break;
			}
			else if(difference > 20){
				System.out.println("-----> froid");
			}else if(difference >= 6 && difference <= 20 ){
				System.out.println("-----> tiède");
			}else if(difference >= 1 && difference <= 5){
				System.out.println("-----> chaud");
			}

		} while (true);
    }


}
