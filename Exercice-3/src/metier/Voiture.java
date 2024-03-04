package metier;

public class Voiture extends Vehicule {
    private String modele;

    private String annee;

    public Voiture(String nom, double prix, String modele, String annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("modele=" + modele + "\n" + "annee=" + annee);
    }
}
