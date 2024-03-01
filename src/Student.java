public class Student extends Persoana {
    String grupa;
    int anulDeStudiu;
    boolean esteLaBuget;


    public Student() {
    }

    public Student(String nume, String prenume, String IDNP, int varsta, String grupa, int anulDeStudiu, boolean esteLaBuget) {
        super(nume, prenume, IDNP, varsta);
        this.grupa = grupa;
        this.anulDeStudiu = anulDeStudiu;
        this.esteLaBuget = esteLaBuget;
    }

    @Override
    public String toString() {
        return "Student - " + super.toString() + ", Grupa: " + grupa + ", Anul de Studiu: " + anulDeStudiu +
                ", Este la buget: " + esteLaBuget;
    }

}
