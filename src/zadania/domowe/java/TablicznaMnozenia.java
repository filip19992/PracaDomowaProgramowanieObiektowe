package zadania.domowe.java;

import java.util.Scanner;

public class TablicznaMnozenia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe wierszy");
        int numberOfRows = scanner.nextInt();

        System.out.println("Podaj liczbe kolumn");
        int numberOfColumns = scanner.nextInt();

        System.out.println(numberOfRows);
        System.out.println(numberOfColumns);

        System.out.println("====================");
        System.out.println(" ");

        for(int i = 1; i <= numberOfColumns; i++) {
            System.out.println();
            for (int j = 1; j <= numberOfRows; j++) {
                System.out.print("  " +i*j);
            }
        }



    }
}
