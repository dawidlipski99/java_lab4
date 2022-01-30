public class Dom implements Budynek {
    public int getOkna() {
        return okna;
    }
    public void setOkna(int okna) {
        this.okna = okna;
    }
    private int okna = 0;
    public int getMieszkancy() {
        return mieszkancy;
    }
    public void setMieszkancy(int mieszkancy) {
        this.mieszkancy = mieszkancy;
    }
    private int mieszkancy = 0;
    public KolorEnum getKolor() {
        return kolor;
    }
    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
    }
    private KolorEnum kolor = KolorEnum.CZERWONY;
    public double powierzchnia(double powBudynku, double powPodrowka, double powParkingu) {
        return powBudynku + powPodrowka + powParkingu;
    }
    public String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy) {
        return ulica + " " + nrDomu + "/" + nrLokalu + ", " + miejscowosc + " " + kodPocztowy;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Dom{" + "okna=" + okna + ", mieszkancy=" + mieszkancy + ", kolor=" + kolor + '}';
    }
    public void liczbaOkien(int value) {
        okna = value;
    }
    public void liczbaMieszkancow(int value) {
        mieszkancy = value;
    }
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }
    public double wyliczCene(double powierzchnia, double cena) {
        return powierzchnia * cena;
    }
    public double iloscOkienNaMieszkanca(int okna, int mieszkancy) {
        return okna * mieszkancy;
    }
    public double iloscOkienIMieszkancow(int okna, int mieszkancy) { return okna + mieszkancy; }
}
