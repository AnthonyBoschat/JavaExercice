package anthony.javabnb.reservations;

import anthony.javabnb.logements.Logement;
import java.util.Date;

public class SejourCourt extends Sejour {

    SejourCourt(Logement logement, Date dateArrivee, int nbNuits, int nbVoyageurs){
        super(logement, dateArrivee, nbNuits, nbVoyageurs);
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.printf("🗺️  Prix du séjour : %s€  ( %s nuit(s) * %s€ )%n", this.prix, this.nbVoyageurs, this.logement.getTarifParNuit());
    }

    @Override
    public boolean aUnNombreDeNuitsCorrect() {
        return this.nbNuits > 0 && this.nbNuits <= 5;
    }

    @Override
    public void miseAJourDuPrixDuSejour(){
        this.prix = super.getTotalPrice();
    }
}
