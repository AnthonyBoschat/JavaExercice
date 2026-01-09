package anthony.javabnb.logements;
import anthony.javabnb.utilisateurs.Hote;

public abstract class Logement {

    protected final Hote      hote;
    protected final int       tarifParNuit;
    protected final String    adresse;
    protected final int       superficie;
    protected final int       nbVoyageursMax;


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

    public int getNbVoyageurMax(){
        return this.nbVoyageursMax;
    }

    abstract public void afficher();
}
