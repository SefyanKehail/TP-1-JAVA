package metier;

public class Rectangle extends Figure {

    private double longueur;

    private double largeur;

    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return this.longueur * this.largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (this.longueur + this.largeur);
    }
}
