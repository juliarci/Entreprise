import java.util.Date;

public class EmployeManutentionARisque extends EmployeManutention implements EmployesARisque{
    public EmployeManutentionARisque(String nom, String prenom, int age, int dateEntree, int nbrHeures) {
        super(nom, prenom, age, dateEntree, nbrHeures);
    }

    @Override
    public int calculerSalaire() {
        return super.calculerSalaire()+prime;
    }
}
