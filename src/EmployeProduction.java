import java.util.Date;

public class EmployeProduction extends Employes{

    private int nbrUnite;

    public EmployeProduction(String nom, String prenom, int age, int dateEntree, int nbrUnite) {
        super(nom, prenom, age, dateEntree);
        this.nbrUnite = nbrUnite;
    }

    @Override
    public int calculerSalaire() {
        int salaire=0;
        salaire= (int) (nbrUnite*5);
        return salaire;
    }

    @Override
    public String toString() {
        return "EmployeProduction{" +
                "nbrUnite=" + nbrUnite +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateEntree=" + dateEntree +
                '}';
    }
}
