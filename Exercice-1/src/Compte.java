
public class Compte {
    private String numero;
    private double solde;
    private static int nbComptes;

    public Compte() {
        nbComptes++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= this.solde) {
            this.solde -= montant;
        } else {
            System.out.println("le solde n'est pas suffisant");
        }
    }

    public void afficherCompteInfo() {
        System.out.println("Numero de compte: " + this.numero + "\n" + "Solde actuel: " + this.solde);
    }

    public static void afficherNbComptes() {
        System.out.println("Nombre de comptes: " + nbComptes);
    }
}
