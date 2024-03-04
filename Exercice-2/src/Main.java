public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent(
                "AdherentNom",
                "AdherentPrenom",
                "adherent@mail.com",
                "0606060606",
                32,
                1
        );

        Auteur auteur = new Auteur(
                "AuteurNom",
                "AuteurPrenom",
                "auteur@mail.com",
                "0707070707",
                56,
                1
                );

        Livre livre = new Livre(111, "TitreLivre", auteur);

        System.out.println(adherent);
        System.out.println(livre);
    }
}
