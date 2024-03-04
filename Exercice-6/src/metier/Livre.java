package metier;

public class Livre implements Empruntable {

    private String titre;

    private String auteur;

    private boolean etatEmprunt;

    public Livre(String titre, String auteur, boolean etatEmprunt) {
        this.titre = titre;
        this.auteur = auteur;
        this.etatEmprunt = etatEmprunt;
    }

    @Override
    public void emprunter() {
        if (this.etatEmprunt) {
            System.out.println(this.titre + " est déjà emprunté");
        } else {
            this.etatEmprunt = true;
        }
    }

    @Override
    public void retourner() {
        if (!this.etatEmprunt) {
            System.out.println(this.titre + " est déjà retourné");
        } else {
            this.etatEmprunt = false;
        }
    }

    public boolean getEtatEmprunt() {
        return etatEmprunt;
    }
}
