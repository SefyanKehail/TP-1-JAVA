package metier;

public class Paiement {
    protected double montant;

    protected String numeroDeTransaction;

    public Paiement(double montant, String numeroDeTransaction) {
        this.montant = montant;
        this.numeroDeTransaction = numeroDeTransaction;
    }

    public void effectuerPaiement(double montant) {
        if (this.montant >= montant) {
            this.montant -= montant;
        } else {
            System.out.println("Solde insuffisant");
        }
    }

}
