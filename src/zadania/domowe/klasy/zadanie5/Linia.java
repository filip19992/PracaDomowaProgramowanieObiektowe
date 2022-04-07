package zadania.domowe.klasy.zadanie5;

public class Linia {

    private Punkt poczatek;
    private Punkt koniec;

    public Linia(Punkt poczatek, Punkt koniec) {
        this.poczatek = poczatek;
        this.koniec = koniec;
    }

    public Punkt getPoczatek() {
        return poczatek;
    }

    public Punkt getKoniec() {
        return koniec;
    }
}
