import java.util.ArrayList;
import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produkt> produkty = new ArrayList<>();
        ArrayList<Produkt> koszyk = new ArrayList<>();

        produkty.add(new Elektronika("Sluchawki", 149.99, 24));
        produkty.add(new Elektronika("Mysz", 79.99, 12));
        produkty.add(new Ubranie("Koszulka", 49.99, "M"));
        produkty.add(new Ubranie("Bluza", 119.99, "L"));

        int wybor;

        do {
            System.out.println("Sklep Internetowy");
            System.out.println("1. Wyswietl produkty");
            System.out.println("2. Dodaj produkt do koszyka");
            System.out.println("3. Wyswietl koszyk");
            System.out.println("4. Zakoncz zakupy");
            System.out.print("Wybor: ");

            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    for (int i = 0; i < produkty.size(); i++) {
                        System.out.println("ID: " + (i + 1));
                        produkty.get(i).wyswietl();
                    }
                    break;

                case 2:
                    System.out.print("Podaj ID produktu: ");
                    int id = scanner.nextInt();

                    if (id >= 1 && id <= produkty.size()) {
                        koszyk.add(produkty.get(id - 1));
                        System.out.println("Dodano do koszyka!");
                    } else {
                        System.out.println("Nieprawidlowe ID.");
                    }
                    break;

                case 3:
                    double suma = 0;

                    System.out.println("Twoj koszyk");

                    for (Produkt p : koszyk) {
                        p.wyswietl();
                        suma += p.getCena();
                    }

                    System.out.printf("Razem: %.2f zl%n", suma);
                    break;

                case 4:
                    System.out.println("Dziekujemy za zakupy!");
                    break;

                default:
                    System.out.println("Nieprawidlowy wybor.");
            }

        } while (wybor != 4);

        scanner.close();
    }
}