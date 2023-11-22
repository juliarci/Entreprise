import java.util.Date;

public class EmployeProductionARisque extends EmployeProduction implements EmployesARisque{
    public EmployeProductionARisque(String nom, String prenom, int age, int dateEntree, int nbrUnite) {
        super(nom, prenom, age, dateEntree, nbrUnite);
    }

    @Override
    public int calculerSalaire() {
        return super.calculerSalaire()+prime;
    }
}
