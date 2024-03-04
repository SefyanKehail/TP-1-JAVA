package presentation;

import metier.Avion;
import metier.Moto;
import metier.Voiture;

public class Main {
    public static void main(String[] args) {
        // Voiture
        System.out.println("**** Voiture ****");
        Voiture voiture = new Voiture(
                "VoitureNom",
                25000,
                "VoitureModele",
                "2018"
        );
        voiture.emettreSon();
        voiture.afficherInformations();

        System.out.println("\n");

        // Moto
        System.out.println("**** Moto ****");
        Moto moto = new Moto(
                "MotoNom",
                17000,
                "MotoMarque",
                "1000CC"
        );
        moto.emettreSon();
        moto.afficherInformations();

        System.out.println("\n");

        // Avion
        System.out.println("**** Avion ****");
        Avion avion = new Avion(
                "AvionNom",
                789000,
                "AvionCompagnie",
                423
        );
        avion.emettreSon();
        avion.afficherInformations();
    }
}

