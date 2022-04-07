package zadania.domowe.klasy.zadanie2;

public class KontoBankowe {

    private double saldo;


    public double pokazSaldo() {
        return saldo;
    }

    public void wplac(int kwota) {
        saldo = saldo + kwota;
        System.out.println("Saldo wynosi teraz: " + saldo);
    }

    public void wyplac(int kwota) {
        double temp = 0;
        temp = saldo;
        saldo = saldo - kwota;
        if (saldo < 0) {
            saldo = temp;
            System.out.println("Nie ma tyle pieniedzy na koncie");
        } else {
            System.out.println("Wyplacono " + kwota + " Pozostało: " + saldo);
        }
    }

}
