public class Adherent extends Personne {
    private int numAdherent;

    public Adherent(
            String name, String prenome, String email, String tel, int age, int numAdherent
    ) {
        super(name, prenome, email, tel, age);
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return "Adherent{" + "numAdherent=" + numAdherent + ", " + super.toString().substring(9);
    }


}
