package metier;

public class DVD implements Empruntable{
    private String titre;

    private String realisateur;

    private boolean etatEmprunt;

    public DVD(String titre, String realisateur, boolean etatEmprunt) {
        this.titre = titre;
        this.realisateur = realisateur;
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
