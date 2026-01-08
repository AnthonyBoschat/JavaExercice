package anthony.javabnb.logements;
import anthony.javabnb.utilisateurs.Hote;

public class Logement {

    private final Hote      hote;
    private final int       tarifParNuit;
    private final String    adresse;
    private final int       superficie;
    private final int       nbVoyageursMax;


    public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax){
        this.hote           = hote;
        this.tarifParNuit   = tarifParNuit;
        this.adresse        = adresse;
        this.superficie     = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public int getTarifParNuit(){
        return this.tarifParNuit;
    }

    public void afficher(){
        System.out.print("🙍 Hôte du logement : ");
        hote.afficher();
        System.out.printf("🗺️  Adresse : %s %n", this.adresse);
        System.out.printf("📏 Superficie : %sm² %n", this.superficie);
        System.out.printf("💵 Tarif par nuit : %s€ %n", this.tarifParNuit);
        System.out.printf("🔒 Nombre de voyageur maximum : %s %n", this.nbVoyageursMax);
    }
}
