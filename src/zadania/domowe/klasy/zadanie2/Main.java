package zadania.domowe.klasy.zadanie2;

public class Main {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe();
        kontoBankowe.wplac(300);
        kontoBankowe.wplac(20);
        kontoBankowe.wyplac(50);
        kontoBankowe.wyplac(400);
        System.out.println(kontoBankowe.pokazSaldo());
    }
}
