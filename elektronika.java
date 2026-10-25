public class Elektronika extends Produkt {
    private int gwarancja;

    public Elektronika(String nazwa, double cena,
                       int gwarancja) {
        super(nazwa, cena);
        this.gwarancja = gwarancja;
    }

    @Override
    public void wyswietl() {
        super.wyswietl();
        System.out.println(
            "Gwarancja: " + gwarancja + " miesiecy"
        );
    }
}