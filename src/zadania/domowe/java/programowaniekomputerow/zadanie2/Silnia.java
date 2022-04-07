package zadania.domowe.java.programowaniekomputerow.zadanie2;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(obliczSilnie(5));

    }

    public static int obliczSilnie(int n) {
        if (n == 0)
            return 1;
        else
            return (n * obliczSilnie(n - 1));
    }
}

