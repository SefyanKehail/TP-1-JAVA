public class Auteur extends Personne {
    private int numAuteur;

    public Auteur(String name, String prenome, String email, String tel, int age, int numAuteur) {
        super(name, prenome, email, tel, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return "Auteur{" + "numAuteur=" + numAuteur + ", " + super.toString().substring(9);
    }
}
