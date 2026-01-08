package anthony.javabnb.logements;

import anthony.javabnb.utilisateurs.Hote;

public class Appartement extends Logement {

    private final int superficieBalcon;
    private final int numeroEtage;
    
    public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieBalcon, int numeroEtage){
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieBalcon = superficieBalcon;
        this.numeroEtage = numeroEtage;
    }

    @Override
    public void afficher(){
        System.out.printf("🔑 Type de logement : Appartement %n");
        super.afficher();
        String balconSentence = this.superficieBalcon > 0 ? "Oui (" + this.superficieBalcon + "m²)" : "Non";
        System.out.printf("🏊  Balcon : %s %n", balconSentence);

    }
}
