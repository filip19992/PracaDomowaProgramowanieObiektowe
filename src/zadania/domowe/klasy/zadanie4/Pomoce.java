package zadania.domowe.klasy.zadanie4;

import java.time.LocalDateTime;

public class Pomoce {


    public Pomoce() {

    }

    public static String getGodzina() {
        String hours = String.valueOf(LocalDateTime.now().getHour());
        String minutes = String.valueOf(LocalDateTime.now().getMinute());

        return "Godzina to: " + hours + ":" + minutes;
    }

    public static double dodajDwieLiczby(double pierwszaLiczba, double drugaLiczba) {
        return pierwszaLiczba+drugaLiczba;
    }
}
