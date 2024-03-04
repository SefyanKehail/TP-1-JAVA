package metier;

public class Commande {
    private double montant;

    private Paiement moyenDePaiement;

    public Commande(double montant, Paiement moyenDePaiement) {
        this.montant = montant;
        this.moyenDePaiement = moyenDePaiement;
    }

    public void processPayment(){
        moyenDePaiement.effectuerPaiement(this.montant);
    }
}
