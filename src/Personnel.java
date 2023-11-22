import java.util.ArrayList;

public class Personnel {

    private ArrayList<Employes> employes;

    public Personnel() {
        employes = new ArrayList<Employes>();
    }
    public void ajouterEmploye(Employes employes1){
        employes.add(employes1);
    }
    public void afficherSalaires(){
        for(Employes emp : employes){
            System.out.println(emp.calculerSalaire());
        }
    }
    public int salaireMoyen() {
        int somme = 0;
        int moy=0;
        for (Employes emp : employes) {
            somme=somme+emp.calculerSalaire();
        }
        moy=somme/(employes.size());
        return moy;
    }
}
