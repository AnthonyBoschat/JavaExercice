package anthony.javabnb;
import anthony.javabnb.logements.Appartement;
import anthony.javabnb.logements.Maison;
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
        Hote jeffBezos      = new Hote("Jeff", "Bezos", 50, 24);
        Hote anthonyBoschat = new Hote("Anthony", "Boschat", 31, 12);
        jeffBezos.afficher();
        anthonyBoschat.afficher();


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

        Maison maisonDeRiche = new Maison(jeffBezos, 10_000, "1 rue de la Richesse", 5400, 20, 10_000, true );
        Appartement appartementAnthony = new Appartement(anthonyBoschat, 35, "69 rue Mirabeau, 37000 Tours", 80, 2, 5, 3);
        maisonDeRiche.afficher();
        System.out.printf("%n");
        appartementAnthony.afficher();


        System.out.printf("%n%n----------------%n");
        System.out.printf("📅 SEJOUR");
        System.out.printf("%n----------------%n%n");
        Date reservationDate                = Utile.createDate(25, 1, 2026);
        Sejour sejourLogementAnthonyBoschat = new Sejour(appartementAnthony, reservationDate, 2, 1);
        sejourLogementAnthonyBoschat.afficher();

    }

}
