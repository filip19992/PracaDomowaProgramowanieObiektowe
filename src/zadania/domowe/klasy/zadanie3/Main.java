package zadania.domowe.klasy.zadanie3;

public class Main {
    public static void main(String[] args) {
        KoszykProduktow koszykProduktow = new KoszykProduktow();

        koszykProduktow.dodajProduktDoKoszyka("Pomidor");
        koszykProduktow.dodajProduktDoKoszyka("Kurczak");
        koszykProduktow.dodajProduktDoKoszyka("Cola");

        System.out.println(koszykProduktow.pokazZamowienie());
    }
}
