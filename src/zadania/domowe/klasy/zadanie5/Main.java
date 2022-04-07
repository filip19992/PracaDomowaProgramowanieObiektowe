package zadania.domowe.klasy.zadanie5;

public class Main {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(2, 5);
        Punkt punkt2 = new Punkt(3, 5);

        Linia linia = new Linia(punkt, punkt2);

        System.out.println(linia.getPoczatek().getX());
        System.out.println(linia.getKoniec().getY());

    }
}
