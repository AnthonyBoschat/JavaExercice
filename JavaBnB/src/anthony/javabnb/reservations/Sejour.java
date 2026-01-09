package anthony.javabnb.reservations;
import anthony.javabnb.logements.Logement;
import anthony.javabnb.outils.Utile;
import java.util.Date;

public class Sejour implements Reservable{

    private final Logement  logement;
    private final Date      dateArrivee;
    private final int       nbNuits;
    private final int       nbVoyageurs;


    public Sejour(Logement logement, Date dateArrivee, int nbNuits, int nbVoyageurs){
        this.logement       = logement;
        this.dateArrivee    = dateArrivee;
        this.nbNuits        = nbNuits;
        this.nbVoyageurs    = nbVoyageurs;
    }

    @Override
    public void afficher(){

        String formatedDate = Utile.formaterDate(this.dateArrivee);
        int tarifParNuit    = this.logement.getTarifParNuit();
        int finalPrice      = this.nbNuits * tarifParNuit;

        this.logement.afficher();
        System.out.printf("%n-- (detail du sejour)%n");
        System.out.printf("📅 Date d'arrivée : %s %n", formatedDate);
        System.out.printf("🌙  Nombre de nuit : %s %n", this.nbNuits);
        System.out.printf("🙍  Nombre de voyageur(s) : %s %n", this.nbVoyageurs);
        System.out.printf("🗺️  Prix du séjour : %s€  ( %s nuit(s) * %s€ )%n", finalPrice, this.nbNuits, tarifParNuit);
    }

    @Override
    public boolean aUneDateArriveeCorrecte() {
        return this.dateArrivee.after(new Date());
    }

    @Override
    public boolean aUnNombreDeNuitsCorrect() {
        return this.nbNuits > 1 && this.nbNuits <= 31;
    }

    @Override
    public boolean aUnNombreDeVoyageursCorrect() {
        return this.nbVoyageurs <= this.logement.getNbVoyageurMax();
    }

    

}
