public class Main {
    public static void main(String[] args) {
        // Zadanie 3a
        Dom dom = new Dom();
        Budynek budynek = new Dom();
        //3b
        dom.kolorDomu(KolorEnum.NIEBIESKI);
        dom.liczbaOkien(5);
        dom.liczbaMieszkancow(10);
        budynek.kolorDomu(KolorEnum.ZIELONY);
        budynek.liczbaOkien(10);
        budynek.liczbaMieszkancow(20);
        //3c
        System.out.println(dom.toString());
        System.out.println(budynek.toString());
        //3d
        System.out.println(dom.iloscOkienIMieszkancow(dom.getOkna(), dom.getMieszkancy()));

    }
}