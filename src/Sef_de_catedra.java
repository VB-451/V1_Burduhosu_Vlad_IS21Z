public class Sef_de_catedra extends Persoana {
    String catedra;

    public Sef_de_catedra(){}

    public Sef_de_catedra(String nume, String prenume, String IDNP, int varsta, String catedra) {
        super(nume, prenume, IDNP, varsta);
        this.catedra = catedra;
    }

    @Override
    public String toString() {
        return "Sef Catedra - " + super.toString() + ", Catedra: " + catedra;
    }
}
