import java.util.Scanner;

public class Tp2 {

    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		// int[] tab = { 4, 6, 4, 2, 10, 2, 4, 8, 10, 1, 4, 9, 8, 9, 4, 1, 8, 2, 9 };
		// int[] tab1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		// int[] tab2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		// int[] tab3 = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		// int[] tab4 = { 2023, 2016, 2014, 2032, 2011, 2022, 2014, 1992, 2014, 1998, 2020, 2028, 2011, 2009, 2017, 2001,
		// 		2028, 2014, 2025 };

		// triComptage(tab);
        runMenu();
	}

    private static void printTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

    private static void runMenu() {
        while (true) {
            printMenu();

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "a", "A" -> runAllExercises();
                case "1" -> exercice1();
                case "2" -> exercice2();
                case "3" -> exercice1();
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
        System.out.println("TP2 - Menu");
        System.out.println("A - Lancer tous les exercices");
        System.out.println("1 - Lancer exercice 1");
        System.out.println("2 - Lancer exercice 2");
        System.out.println("3 - Lancer exercice 3");
        System.out.println("0 - Quitter");
        System.out.printf("%n");
        System.out.print("Votre choix : ");
    }

    private static void waitForEnter() {
        System.out.printf("%n%nAppuyez sur Entrée pour revenir au menu...");
        scanner.nextLine();
    }

    private static void runAllExercises() {
        exercice1();
        exercice2();
        exercice3();
    }

    private static void presentationExercice(String exerciceNumber) {
		System.out.printf("%n%n%n%n");
        System.out.printf("%n---------------------------%n");
        System.out.printf("Démarrage de l'exercice %s%n", exerciceNumber);
        System.out.printf("---------------------------%n%n");
    }




    private static int fibonacciRecursive(int fibonnaci_position) {
        return fibonacciTraitement(fibonnaci_position, 0, 1); // F0 et F1 par défaut
    }

    
    private static int fibonacciTraitement(int remaining_steps, int previous_value, int current_value) {
        if (remaining_steps == 0) return previous_value; // Quand le nombre d'étape est atteinte, c'est à dire le nombre d'étape = la position voulu
        return fibonacciTraitement(remaining_steps - 1, current_value, previous_value + current_value);
    }


	private static void exercice1() {
        presentationExercice("1");

        String  user_input;
        int     parsed_user_input;
        int     fibonacci_number;
        
        
        while(true){
            System.out.print("Saisir un nombre : ");
            user_input = scanner.nextLine();
            
            try {
                parsed_user_input = Integer.parseInt(user_input);
                if(parsed_user_input < 0){
                    System.out.printf("Nombre invalide, merci de rentrer un nombre entier positif %n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.print("Nombre invalide, merci de rentrer un nombre entier positif %n");
                continue;
            }
            break;
        }
        
        
        ////////////////////////////////////////////////////////////////////////////////////////// 
        // Solution 1, sans tableau, sans recursivité
        // ➡️ Nécessite de calculer jusqu'à de F0 à FN pour pouvoir sortir le résultat
        // ➡️ Plus de code
        // ➡️ Plus complexe à relire
        // ➡️ Plus couteux en calcul
        // ➡️ Relativement viable en condition réel
        ////////////////////////////////////////////////////////////////////////////////////////// 

        // if(parsed_user_input == 0 || parsed_user_input == 1){
        //     fibonacci_number = parsed_user_input;
        // }else{
        //     int position_1_before_user_input = 1;
        //     int position_2_before_user_input = 0;

        //     for(int i = 2; i <= parsed_user_input; i++){
        //         fibonacci_number = position_1_before_user_input + position_2_before_user_input; 
        //         position_2_before_user_input = position_1_before_user_input;                   
        //         position_1_before_user_input = fibonacci_number;
        //     }

        //     fibonacci_number = position_1_before_user_input;
        // }

        // System.out.printf("Fibo à F%s = %s", user_input, fibonacci_number);





        ////////////////////////////////////////////////////////////////////////////////////////// 
        // Solution 2.1 (L'arnaque), avec tableau {0,1,1,2,3,5,8,13,21,34,55,89,144} (Les 13 prmeières solutions seulement)
        // ➡️ Nécessite d'avoir un tableau
        // ➡️ Ne peut pas dépasser les limites de ce que prévois le tableau
        // ➡️ Beaucoup moins de calcul
        // ➡️ Pas viable en condition réel
        ////////////////////////////////////////////////////////////////////////////////////////// 

        // int[] fibonacci_array = {0,1,1,2,3,5,8,13,21,34,55,89,144};
        // fibonacci_number = fibonacci_array[parsed_user_input];
        // System.out.printf("Fibo à F%s = %s", user_input, fibonacci_number);


        ////////////////////////////////////////////////////////////////////////////////////////// 
        // Solution 2.2, avec tableau[] générer
        // ➡️ Plus simple à relire
        // ➡️ Créer un tableau qui peut être utiliser ailleurs en théorie (Et accéder à une valeur du tableau simplement avec son index)
        // ➡️ Viable en condition réel
        ////////////////////////////////////////////////////////////////////////////////////////// 

        // int[] fibonacci_array;
        // fibonacci_array = new int[parsed_user_input + 1];

        // for(int index = 0; index < fibonacci_array.length; index++){
        //     int number;
        //     if(index == 0 || index == 1){
        //         number = index;
        //     }else{
        //         number = fibonacci_array[index - 1] + fibonacci_array[index - 2];
        //     }
        //     fibonacci_array[index] = number;
        // }

        // fibonacci_number = fibonacci_array[parsed_user_input];
        // System.out.printf("Fibo à F%s = %s", user_input, fibonacci_number);





        ////////////////////////////////////////////////////////////////////////////////////////// 
        // Solution 3, avec méthode recursive
        // ➡️ centralise les logique dans des méthodes dédier
        // ➡️ moins de code
        // ➡️ facilement réutilisable
        // ➡️ Viable en condition réel
        // ➡️ Beaucoup plus complexe à suivre
        ////////////////////////////////////////////////////////////////////////////////////////// 

        fibonacci_number = fibonacciRecursive(parsed_user_input);
        System.out.printf("Fibo à F%s = %s", user_input, fibonacci_number);

	}

	private static void exercice2() {

        
		// printTab();
	}

	private static void exercice3() {
		// printTab();
	}

	
}