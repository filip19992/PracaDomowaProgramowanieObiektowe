package zadania.domowe.java.programowaniekomputerow.zadanie2;

import java.util.Scanner;

public class Nieparzysta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean posiadaNieparzystosc = false;


       String numbers = scanner.nextLine();

       String[] output = numbers.split(" ");

       for(int i = 0; i < output.length;i++) {
          if(Integer.parseInt(output[i])%2==0) {
              posiadaNieparzystosc = true;
          }
       }

        System.out.println("Czy tablica posiada nieparzystosc?" + posiadaNieparzystosc);

    }

}
