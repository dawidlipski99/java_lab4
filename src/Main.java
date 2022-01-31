public class Main {
    public static void main(String[] args) {
        // Zadanie 3a
        Dom dom = new Dom();
        Budynek budynek = new Dom();
        //3b
        dom.kolorDomu(KolorEnum.NIEBIESKI);
        dom.liczbaOkien(4);
        dom.liczbaMieszkancow(8);
        budynek.kolorDomu(KolorEnum.ZIELONY);
        budynek.liczbaOkien(8);
        budynek.liczbaMieszkancow(10);
        //3c
        System.out.println(dom.toString());
        System.out.println(budynek.toString());
        //3d
        System.out.println(dom.iloscOkienIMieszkancow(dom.getOkna(), dom.getMieszkancy()));

    }
}