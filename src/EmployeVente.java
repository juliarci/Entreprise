import java.util.Date;

public class EmployeVente extends Employes {
    private int chiffreAffaire;

    public EmployeVente(String nom, String prenom, int age, int dateEntree, int chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public int calculerSalaire() {
        int salaire=0;
        salaire= (int) (400+(chiffreAffaire*0.20));
        return salaire;
    }

    @Override
    public String toString() {
        return "EmployeVente{" +
                "chiffreAffaire=" + chiffreAffaire +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateEntree=" + dateEntree +
                '}';
    }
}
