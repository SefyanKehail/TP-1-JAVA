package presentation;

import metier.DVD;
import metier.Livre;
import metier.Utilisateur;

public class GestionBibliothequeApp {
    public static void main(String[] args) {

        // Utilisateur
        Utilisateur utilisateur = new Utilisateur("UtilisateurNom");

        // Livres
        Livre livre1 = new Livre("TitreLivre1", "AuteurLivre1", true);
        Livre livre2 = new Livre("TitreLivre2", "AuteurLivre2", false);

        // DVDs
        DVD dvd1 = new DVD("TitreDVD1", "RealisateurDVD1", true);
        DVD dvd2 = new DVD("TitreDVD2", "RealisateurDVD2", false);


        // emprunts
        utilisateur.emprunterObjet(livre1);
        utilisateur.emprunterObjet(dvd2);

        // retours
        livre2.retourner();
        livre1.retourner();
        dvd2.retourner();
        dvd1.retourner();

        // emprunts;
        utilisateur.emprunterObjet(livre1);
    }
}
