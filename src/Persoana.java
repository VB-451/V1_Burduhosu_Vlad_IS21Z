import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persoana {
    String nume;
    String prenume;
    private String IDNP;
    int varsta;

    public Persoana(){
    }

    public Persoana(String nume, String prenume, String IDNP, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.IDNP = IDNP;
        this.varsta = varsta;
    }

    public String getIDNP() {
        return IDNP;
    }

    static List<Persoana> filtreazaDupaVarsta(List<? extends Persoana> lista, int varstaMinima, int varstaMaxima) {
        List<Persoana> rezultat = new ArrayList<>();
        for (Persoana persoana : lista) {
            if (persoana.varsta >= varstaMinima && persoana.varsta <= varstaMaxima) {
                rezultat.add(persoana);
            }
        }
        return rezultat;
    }

    @Override
    public String toString() {
        return "Nume: " + nume +", Prenume: "+ prenume + ", IDNP: " + IDNP + ", Varsta: " + varsta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Persoana)) {
            return false;
        }
        Persoana persoana = (Persoana) obj;
        return nume.equals(persoana.nume) && prenume.equals(persoana.prenume) && IDNP.equals(persoana.IDNP) && varsta == persoana.varsta;
    }


}
