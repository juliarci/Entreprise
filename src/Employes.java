import java.util.Date;

public abstract class Employes {
    protected String nom;
    protected String prenom;
    protected int age;
    protected int dateEntree;

    public Employes(String nom, String prenom, int age, int dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    public abstract int calculerSalaire();

    public String getNom() {
        return nom;
    }
}
