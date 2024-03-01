import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Ana", "Popescu", "1234567890123", 30);
        Student student1 = new Student("Ion", "Ionescu", "1234567890456", 20, "Info", 2, true);
        Profesor profesor1 = new Profesor("Maria", "Georgescu", "1234567890789", 40, "Matematica", 5000);
        Profesor profesor2 = new Profesor("Andrei", "Popa", "1234567890321", 35, "Fizica", 5500);
        Sef_de_catedra sefCatedra1 = new Sef_de_catedra("George", "Mihai", "1234567890654", 50, "Chimie");

        List<Persoana> listaPersoane = new ArrayList<>();
        listaPersoane.add(student1);
        listaPersoane.add(profesor1);
        listaPersoane.add(profesor2);
        listaPersoane.add(sefCatedra1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti varsta minima pentru filtrare: ");
        int varstaMinima = scanner.nextInt();
        System.out.print("Introduceti varsta maxima pentru filtrare: ");
        int varstaMaxima = scanner.nextInt();

        List<Persoana> filtrateDupaVarsta = Persoana.filtreazaDupaVarsta(listaPersoane, varstaMinima, varstaMaxima);
        System.out.println("Persoanele cu varsta cuprinsa intre " + varstaMinima + " si " + varstaMaxima + " sunt:");
        for (Persoana p : filtrateDupaVarsta) {
            System.out.println(p);
        }

        System.out.println("---------------------------------");

        Student studentDeComparat = new Student("Ion", "Ionescu", "1234567890456", 20, "Info", 2, true);

        for (Persoana p : listaPersoane) {
            if (p.equals(studentDeComparat)) {
                System.out.println(p + " - Coincide");
            } else {
                System.out.println(p + " - Nu coincide");
            }
        }
    }
}
