public class Produkt{
    protected String nazwa;
    protected double cena;

    public Produkt(String nazwa,double cena) {
        this nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }
    public void wyswietl(){
        System.out.println(nazwa + "-" + cena + "zł")
    }
}