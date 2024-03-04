package metier;

public class Paypal extends Paiement{
    private String email;

    public Paypal(double montant, String numeroDeTransaction, String email) {
        super(montant, numeroDeTransaction);
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        super.effectuerPaiement(montant);
        System.out.println("Paiement d'un montant de " + montant + " est effectué par Paypal");
        System.out.println("Solde actuel: " + this.montant);
    }
}
