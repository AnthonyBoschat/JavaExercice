package anthony.javabnb.reservations;

import anthony.javabnb.outils.Utile;
import anthony.javabnb.utilisateurs.Voyageur;
import java.util.Date;

public class Reservation {
    private final Reservable    objetReservable;
    private final Voyageur      voyageur;
    private final Date          dateDeReservation;

    public Reservation(Reservable objetReservable, Voyageur voyageur) {

        if(!objetReservable.aUneDateArriveeCorrecte()){
            throw new ExceptionInInitializerError("La date d'arrivée se situe dans le passé");
        }else if(!objetReservable.aUnNombreDeNuitsCorrect()){
            throw new ExceptionInInitializerError("Le nombre de nuit voulu dépasse le nombre de nuit réservable");
        }else if(!objetReservable.aUnNombreDeVoyageursCorrect()){
            throw new ExceptionInInitializerError("Le nombre de voyageur dépasse le nombre de voyageur maximum accepté");
        }

        this.objetReservable    = objetReservable;
        this.voyageur           = voyageur;
        this.dateDeReservation  = new Date();
    }


    public void afficher(){
        System.out.printf("📅  Date de réservation : %s %n", Utile.formaterDate(this.dateDeReservation, "dd/MM/yyyy à HH'h 'mm'm 'ss's'"));
        System.out.printf("🙍  Voyageur : "); 
        this.voyageur.afficher();
        System.out.printf("🔒  A réservé chez : %n"); 
        this.objetReservable.afficher();
    }
}