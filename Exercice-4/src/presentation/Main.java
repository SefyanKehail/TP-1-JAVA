package presentation;

import metier.Ingenieur;
import metier.Manager;

public class Main {
    public static void main(String[] args) {
        // Ingenieur
        Ingenieur ingenieur = new Ingenieur(
                "IngenieurNom",
                "IngenieurPrenom",
                "ingenieur@mail.com",
                "0606060606",
                16000,
                "IngenieurSpecialite"
        );

        System.out.println("***** Ingenieur ******");
        System.out.println(ingenieur);
        System.out.println("\n");

        // Manager
        Manager manager = new Manager(
                "IngenieurNom",
                "IngenieurPrenom",
                "ingenieur@mail.com",
                "0606060606",
                16000,
                "ManagerService"
        );

        System.out.println("***** Manager ******");
        System.out.println(manager);

    }
}
