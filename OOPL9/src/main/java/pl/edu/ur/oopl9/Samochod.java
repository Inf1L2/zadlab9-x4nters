package pl.edu.ur.oopl9;

public class Samochod {
    private String marka;
    private String nazwa;
    private double pojSilnika;
    private int maxPredkosc;
    private double cena;

    public String getMarka() {
        return marka;
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getPojSilnika() {
        return pojSilnika;
    }
    public int getMaxPredkosc() {
        return maxPredkosc;
    }
    public double getCena() {
        return cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setPojSilnika(double pojSilnika) {
        this.pojSilnika = pojSilnika;
    }
    public void setMaxPredkosc(int maxPredkosc) {
        this.maxPredkosc = maxPredkosc;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    public Samochod(String marka, String nazwa, double pojSilnika, int maxPredkosc, double cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojSilnika = pojSilnika;
        this.maxPredkosc = maxPredkosc;
        this.cena = cena;
    }
}
