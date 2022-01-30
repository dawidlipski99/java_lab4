// Zadanie 1 a,b
public interface Budynek {
    double powierzchnia(double powBudynku, double powPodrowka, double powParkingu);
    String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
    void liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
    double wyliczCene(double powierzchnia, double cena);
    //1d
    double iloscOkienNaMieszkanca(int okna, int mieszkancy);
}
