package anthony.javabnb.reservations;
import anthony.javabnb.logements.Logement;
import anthony.javabnb.outils.Utile;
import java.util.Date;

public abstract class Sejour implements Reservable{

    protected final Logement    logement;
    private   final Date        dateArrivee;
    protected final int         nbNuits;
    protected final int         nbVoyageurs;
    protected       int         prix;

    
    protected Sejour(Logement logement, Date dateArrivee, int nbNuits, int nbVoyageurs){
        this.logement       = logement;
        this.dateArrivee    = dateArrivee;
        this.nbNuits        = nbNuits;
        this.nbVoyageurs    = nbVoyageurs;
        this.miseAJourDuPrixDuSejour();
    }
    
    public int getTotalPrice(){
        int tarifParNuit    = this.logement.getTarifParNuit();
        int totalPrice      = tarifParNuit * this.nbNuits;
        return totalPrice;
    }
    
    @Override
    public void afficher(){
        
        String formatedDate = Utile.formaterDate(this.dateArrivee);
        
        this.logement.afficher();
        System.out.printf("%n-- (detail du sejour)%n");
        System.out.printf("📅 Date d'arrivée : %s %n", formatedDate);
        System.out.printf("🌙  Nombre de nuit : %s %n", this.nbNuits);
        System.out.printf("🙍  Nombre de voyageur(s) : %s %n", this.nbVoyageurs);
    }
    
    @Override
    public boolean aUneDateArriveeCorrecte() {
        return this.dateArrivee.after(new Date());
    }
    
    @Override
    public boolean aUnNombreDeVoyageursCorrect() {
        return this.nbVoyageurs <= this.logement.getNbVoyageurMax();
    }
    
    public abstract void miseAJourDuPrixDuSejour();
}
