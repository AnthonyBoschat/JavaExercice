package anthony.javabnb;
import anthony.javabnb.logements.Logement;
import anthony.javabnb.outils.Utile;
import anthony.javabnb.reservations.Sejour;
import anthony.javabnb.utilisateurs.Hote;
import anthony.javabnb.utilisateurs.Voyageur;
import java.util.Date;



public class Main {

    public static void main(String[] args) {

        System.out.printf("%n%n----------------%n");
        System.out.printf("🙍 Hôte");
        System.out.printf("%n----------------%n%n");
        Hote hote     = new Hote("Anthony", "Boschat", 31, 12);
        hote.afficher();


        System.out.printf("%n%n----------------%n");
        System.out.printf("🧳 Voyageurs");
        System.out.printf("%n----------------%n%n");
        Voyageur benoitMonteiro     = new Voyageur("Benoit", "Monteiro", 35);
        Voyageur mathiasCharpentier = new Voyageur("Mathias", "Charpentier", 39);

        benoitMonteiro.afficher();
        mathiasCharpentier.afficher();

        System.out.printf("%n%n----------------%n");
        System.out.printf("🏠 LOGEMENT");
        System.out.printf("%n----------------%n%n");

        Logement logementAnthonyBoschat = new Logement(hote, 35, "69 rue Mirabeau, 37000 Tours", 80, 2);
        logementAnthonyBoschat.afficher();


        System.out.printf("%n%n----------------%n");
        System.out.printf("📅 SEJOUR");
        System.out.printf("%n----------------%n%n");
        Date reservationDate                = Utile.createDate(25, 1, 2026);
        Sejour sejourLogementAnthonyBoschat = new Sejour(logementAnthonyBoschat, reservationDate, 2, 1);
        sejourLogementAnthonyBoschat.afficher();

    }

}
