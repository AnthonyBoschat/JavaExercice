package anthony.javabnb.reservations;

import anthony.javabnb.logements.Logement;
import java.util.Date;

public final class SejourFactory {


    private SejourFactory(){}

    public static Sejour createSejour(
        Logement    logement,
        Date        dateArrivee,
        int         nbNuits,
        int         nbVoyageurs
    ){
        if(nbNuits >= 6){
            return new SejourLong(logement, dateArrivee, nbNuits, nbVoyageurs);
        }else{
            return new SejourCourt(logement, dateArrivee, nbNuits, nbVoyageurs);
        }
    }
}
