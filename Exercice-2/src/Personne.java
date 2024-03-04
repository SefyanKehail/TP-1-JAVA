public class Personne {
    private String name;
    private String prenome;
    private String email;
    private String tel;
    private int age;

    public Personne(String name, String prenome, String email, String tel, int age) {
        this.name = name;
        this.prenome = prenome;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", prenome='" + prenome + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +
                '}';
    }
}
