import java.util.Date;

public class EmployeManutention extends Employes {
    private int nbrHeures;

    public EmployeManutention(String nom, String prenom, int age, int dateEntree, int nbrHeures) {
        super(nom, prenom, age, dateEntree);
        this.nbrHeures = nbrHeures;
    }

    @Override
    public int calculerSalaire() {
        int salaire = 0;
        salaire = (int) (nbrHeures * 65);
        return salaire;
    }

    @Override
    public String toString() {
        return "EmployeManutention{" +
                "nbrHeures=" + nbrHeures +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateEntree=" + dateEntree +
                '}';
    }
}
