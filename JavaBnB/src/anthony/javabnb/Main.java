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

        section("🙍 Hôte");
        Hote jeffBezos      = new Hote("Jeff", "Bezos", 50, 1);
        Hote anthonyBoschat = new Hote("Anthony", "Boschat", 31, 12);
        jeffBezos.afficher();
        anthonyBoschat.afficher();


        section("🧳 Voyageurs");
        Voyageur benoitMonteiro     = new Voyageur("Benoit", "Monteiro", 35);
        Voyageur mathiasCharpentier = new Voyageur("Mathias", "Charpentier", 39);

        benoitMonteiro.afficher();
        mathiasCharpentier.afficher();

        section("🏠 LOGEMENT");
        Maison maisonJeff               = new Maison(jeffBezos, 10_000, "1 rue de la Richesse", 5400, 20, 10_000, true );
        Appartement appartementAnthony  = new Appartement(anthonyBoschat, 35, "69 rue Mirabeau, 37000 Tours", 80, 2, 5, 3);
        maisonJeff.afficher();
        dividerLarge();
        appartementAnthony.afficher();


        section("📅 SEJOUR");
        Date reservationDate                = Utile.createDate(25, 1, 2026);
        Sejour sejourLogementAnthonyBoschat = new Sejour(appartementAnthony, reservationDate, 2, 1);
        Sejour sejourLogementJeffBezos      = new Sejour(maisonJeff, reservationDate, 7, 1);
        sejourLogementAnthonyBoschat.afficher();
        dividerLarge();
        sejourLogementJeffBezos.afficher();

    }

    public static void section(String title){
        System.out.printf("%n%n----------------%n");
        System.out.printf(title);
        System.out.printf("%n----------------%n%n");
    }

    public static void dividerLarge(){
        System.out.printf("%n------------------------%n------------------------%n%n");
    }

}
