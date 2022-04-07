package zadania.domowe.java;

import java.util.Scanner;

public class Średnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        double i = scanner.nextDouble();

        System.out.println("Podaj druga liczbe");
        double j = scanner.nextDouble();

        System.out.println("Wynikt to: " + obliczSredniaFuncyjnie(i, j));
        obliczSredniProdeceduralnie(i,j);
    }

    private static double obliczSredniaFuncyjnie(double pierwszaLiczba, double drugaLiczba) {
        return (pierwszaLiczba+drugaLiczba)/2;
    }

    private static void obliczSredniProdeceduralnie(double pierwszaLiczba, double drugaLiczba) {
        System.out.println("Wynik to: " + (pierwszaLiczba+drugaLiczba)/2);
    }
}
