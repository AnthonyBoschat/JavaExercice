package anthony.javabnb.logements;

import anthony.javabnb.utilisateurs.Hote;

public class Maison extends Logement {
    
    private final int       superficieJardin;
    private final boolean   possedePiscine;

    public Maison(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieJardin, boolean possedePiscine){
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieJardin   = superficieJardin;
        this.possedePiscine     = possedePiscine;
    }

    @Override
    public void afficher(){
        String piscineSentence  = this.possedePiscine ? "Oui" : "Non";
        String jardinSentence   = this.superficieJardin > 0 ? "Oui (" + this.superficieJardin + "m²)" : "Non";
        
        System.out.printf("%n-- (detail du logement)%n");
        System.out.printf("🔑 Type de logement : Maison %n");
        System.out.print("🙍 Hôte du logement : ");
        super.hote.afficher();
        System.out.printf("🗺️  Adresse : %s %n", super.adresse);
        System.out.printf("📏 Superficie : %sm² %n", super.superficie);
        System.out.printf("💵 Tarif par nuit : %s€ %n", super.tarifParNuit);
        System.out.printf("🔒 Nombre de voyageur maximum : %s %n", super.nbVoyageursMax);
        System.out.printf("🌲  Jardin : %s %n", jardinSentence);
        System.out.printf("🏊  Piscine : %s %n", piscineSentence);
        
    }
}
