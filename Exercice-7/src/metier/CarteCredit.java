package metier;

public class CarteCredit extends Paiement {
    private String numeroDeCarte;

    public CarteCredit(double montant, String numeroDeTransaction, String numeroDeCarte) {
        super(montant, numeroDeTransaction);
        this.numeroDeCarte = numeroDeCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        super.effectuerPaiement(montant);
        System.out.println("Paiement d'un montant de " + montant + " est effectué par CarteCredit");
        System.out.println("Solde actuel: " + this.montant);
    }
}
