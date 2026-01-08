package anthony.javabnb.utilisateurs;

public class Personne {

    private final String    prenom;
    private final String    nom;
    private final int       age;

    public Personne(String prenom, String nom, int age){
        this.prenom  = prenom;
        this.nom     = nom;
        this.age     = age;
    }

    public void afficher(){
        System.out.printf("%s %s (%s ans)%n", prenom, nom, age);
    }
}