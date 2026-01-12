package anthony.javabnb.reservations;

import anthony.javabnb.logements.Logement;
import java.util.Date;

public class SejourLong extends Sejour{


    private final static    int PROMOTION_EN_POURCENTAGE = 20;
    private final           int promotion;

    public SejourLong(Logement logement, Date dateArrivee, int nbNuits, int nbVoyageurs){
        super(logement, dateArrivee, nbNuits, nbVoyageurs);
        this.promotion  = this.calculerPromotion();
    }

    private int calculerPromotion() {
        return (super.getTotalPrice() * PROMOTION_EN_POURCENTAGE) / 100;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.printf("💰  Prix du séjour : %s€  (%s de promotion) - ( %s nuit(s) * %s€ )%n", this.prix, this.promotion, this.nbNuits, this.logement.getTarifParNuit());
    }

    @Override
    public boolean aUnNombreDeNuitsCorrect() {
        return this.nbNuits >= 6;
    }

    @Override
    public void miseAJourDuPrixDuSejour(){
        this.prix = super.getTotalPrice() - this.promotion;
    }
}
