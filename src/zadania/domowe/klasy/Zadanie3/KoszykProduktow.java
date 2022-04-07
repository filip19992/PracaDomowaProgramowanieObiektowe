package zadania.domowe.klasy.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class KoszykProduktow {
    private List<String> produkty = new ArrayList<>();

    public KoszykProduktow(List<String> produkty) {
        this.produkty = produkty;
    }

    public KoszykProduktow() {
    }

    public List<String> pokazZamowienie() {
        return produkty;
    }

    public void dodajProduktDoKoszyka(String nazwaProduktu) {
        produkty.add(nazwaProduktu);
    }
}
