package anthony.javabnb;
import anthony.javabnb.logements.Logement;
import anthony.javabnb.outils.Utile;
import anthony.javabnb.reservations.Sejour;
import anthony.javabnb.utilisateurs.Personne;
import java.util.Date;



public class Main {

    public static void main(String[] args) {

        System.out.printf("%n%n----------------%n");
        System.out.printf("🙍 PERSONNE");
        System.out.printf("%n----------------%n%n");

        Personne anthonyBoschat     = new Personne("Anthony", "Boschat", 31);
        Personne benoitMonteiro     = new Personne("Benoit", "Monteiro", 35);
        Personne mathiasCharpentier = new Personne("Mathias", "Charpentier", 39);

    
        anthonyBoschat.afficher();
        benoitMonteiro.afficher();
        mathiasCharpentier.afficher();

        System.out.printf("%n%n----------------%n");
        System.out.printf("🏠 LOGEMENT");
        System.out.printf("%n----------------%n%n");

        Logement logementAnthonyBoschat = new Logement(anthonyBoschat, 35, "69 rue Mirabeau, 37000 Tours", 80, 2);
        logementAnthonyBoschat.afficher();


        System.out.printf("%n%n----------------%n");
        System.out.printf("📅 SEJOUR");
        System.out.printf("%n----------------%n%n");
        Date reservationDate                = Utile.createDate(25, 1, 2026);
        Sejour sejourLogementAnthonyBoschat = new Sejour(logementAnthonyBoschat, reservationDate, 2, 1);
        sejourLogementAnthonyBoschat.afficher();

    }

}
