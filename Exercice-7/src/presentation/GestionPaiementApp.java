package presentation;

import metier.CarteCredit;
import metier.Commande;
import metier.Paiement;
import metier.Paypal;

public class GestionPaiementApp {
    public static void main(String[] args) {
        // Moyens de paiements
        CarteCredit carteCredit = new CarteCredit(
                10000,
                "291041",
                "3902852984262333"
        );

        Paypal paypal = new Paypal(
                5000,
                "12241124",
                "user@mail.com"
        );

        // Commandes
        Commande commandeCarteCredit = new Commande(3000, carteCredit);
        Commande commandePaypal = new Commande(1500, paypal);

        // Paiements
        commandeCarteCredit.processPayment();
        System.out.println("\n");
        commandePaypal.processPayment();
    }
}
