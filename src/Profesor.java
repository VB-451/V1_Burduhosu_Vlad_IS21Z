public class Profesor extends Persoana{
    String specializare;
    int salariu;

    public Profesor(){}

    public Profesor(String nume, String prenume, String IDNP, int varsta, String specializare, int salariu) {
        super(nume, prenume, IDNP, varsta);
        this.specializare = specializare;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Profesor - " + super.toString() + ", Specializare: " + specializare + ", Salariu: " + salariu;
    }
}
