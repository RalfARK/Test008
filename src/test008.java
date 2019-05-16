import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class test008 {

    private static int pobierzLiczbe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowita: ");

        while (true) {
            try {
                return scanner.nextInt();
            }
            catch ( NoSuchElementException  | IllegalStateException exeption )
            {
                System.out.println("Podałe niepoprawną liczbę, spróbuj jeszcze raz: ");
                scanner.next();
            }
        }
    }

    private static int mnozenie(int liczba) {
        return (int)(liczba*Math.PI);
    }

    private static double mnozenie2(int liczba) {
        return liczba*Math.PI;
    }

    private static double dzielenie(int liczba1, int liczba2) {

        return (double)liczba1/(double)liczba2;
    }

    public static void main(String[] args) {
        System.out.println("Zaczynamy!");
        int  liczba = pobierzLiczbe();

        System.out.println("Mnożenie 1 podanej liczby * PI: "+mnozenie(liczba));
        System.out.println("Mnożenie 2 podanej liczby * PI: "+mnozenie2(liczba));

        System.out.println("Dzielenie!");
        int liczba2 = pobierzLiczbe();
        int liczba3 = pobierzLiczbe();

        System.out.println("Wynik dzielenie liczb: "+dzielenie(liczba2, liczba3));
    }
}
