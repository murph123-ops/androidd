public class Ubranie extends Produkt {
    private String rozmiar;

    public Ubranie(String nazwa, double cena,
                   String rozmiar) {
        super(nazwa, cena);
        this.rozmiar = rozmiar;
    }

    @Override
    public void wyswietl() {
        super.wyswietl();
        System.out.println("Rozmiar: " + rozmiar);
    }
}