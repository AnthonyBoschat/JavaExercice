package anthony.javabnb.logements;

import anthony.javabnb.utilisateurs.Hote;

public class Appartement extends Logement {

    private final int superficieBalcon;
    private final int numeroEtage;
    
    public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieBalcon, int numeroEtage){
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieBalcon   = superficieBalcon;
        this.numeroEtage        = numeroEtage;
    }

    @Override
    public void afficher(){
        String balconSentence = this.superficieBalcon > 0 ? "Oui (" + this.superficieBalcon + "m²)" : "Non";

        System.out.printf("%n-- (detail du logement)%n");
        System.out.printf("🔑 Type de logement : Appartement %n");
        System.out.print("🙍 Hôte du logement : ");
        super.hote.afficher();
        System.out.printf("🗺️  Adresse : %s %n", super.adresse);
        System.out.printf("📏 Superficie : %sm² %n", super.superficie);
        System.out.printf("💵 Tarif par nuit : %s€ %n", super.tarifParNuit);
        System.out.printf("🔒 Nombre de voyageur maximum : %s %n", super.nbVoyageursMax);
        System.out.printf("🛎️  Étage : %s %n", this.numeroEtage);
        System.out.printf("🏊  Balcon : %s %n", balconSentence);

    }
}
