import java.util.Scanner;

public class Main {

    public static float add(float a, float b) {
        return a + b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static float mult(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new RuntimeException("Nie można dzielić przez 0");
        }
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Wybierz działanie: 1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie");

        int dzialanie;
        float a, b;

        try {
            dzialanie = myObj.nextInt();
            System.out.println("Podaj a: ");
            a = myObj.nextFloat();
            System.out.println("Podaj b: ");
            b = myObj.nextFloat();
        } catch (java.util.InputMismatchException e) {
            System.out.print("Błąd, podany znak nie jest cyfrą.");
            return;
        }

        switch (dzialanie) {
            case 1:
                System.out.println("Wynik dodawania: " + add(a, b));
                break;
            case 2:
                System.out.println("Wynik odejmowania: " + sub(a, b));
                break;
            case 3:
                System.out.println("Wynik mnozenia: " + mult(a, b));
                break;
            case 4:

                try {
                    System.out.println("Wynik dzielenia: " + div(a, b));
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
                break;

            default:
                System.out.println("Nie wybrano opcji od 1-4.");
                break;
        }

    }
}