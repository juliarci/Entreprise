class Salaires {

    public static void main(String[] args) {

      Personnel p = new Personnel();

        p.ajouterEmploye(new EmployeVente("Pierre", "Business", 45, 1995, 30000));

        p.ajouterEmploye(new EmployeRepresentation("Léon", "Vendtout", 25, 2001, 20000));

        p.ajouterEmploye(new EmployeProduction("Yves", "Bosseur", 28, 1998, 1000));

        p.ajouterEmploye(new EmployeManutention("Jeanne", "Stocketout", 32, 1998, 45));

        p.ajouterEmploye(new EmployeProductionARisque("Jean", "Flippe", 28, 2000, 1000));

        p.ajouterEmploye(new EmployeManutentionARisque("Al", "Abordage", 30, 2001, 45));



        p.afficherSalaires();

        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " euros.");
    }

}