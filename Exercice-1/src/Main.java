public class Main {
    public static void main(String[] args) {

        Compte.afficherNbComptes();

        System.out.println("Création des comptes ... Succès");

        Compte compte1 = new Compte();
        Compte compte2 = new Compte();

        Compte.afficherNbComptes();

        // compte 1
        System.out.println("\n");
        System.out.println("Informations compte 1");

        compte1.setNumero("111");
        compte1.setSolde(67000);
        compte1.afficherCompteInfo();

        System.out.println("\n");
        System.out.println("Opérations sur compte 1");

        compte1.deposer(3000);
        compte1.retirer(20000);
        compte1.afficherCompteInfo();

        // compte 2
        System.out.println("\n");
        System.out.println("Informations compte 2");

        compte2.setNumero("222");
        compte2.setSolde(1500);
        compte2.afficherCompteInfo();

        System.out.println("\n");
        System.out.println("Opérations sur compte 2");

        compte2.deposer(500);
        compte2.retirer(3000);
        compte2.afficherCompteInfo();

    }
}
