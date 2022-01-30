public class Main {
    public static void main(String[] args) {
        // Indeks: 56103

        // Zadanie 2.c
        Kwadrat kwadrat = new Kwadrat(10);
        Prostokat prostokat = new Prostokat(10, 20);

        System.out.println(kwadrat.nazwaFigury("kwadrat"));
        System.out.println("Obwod: " + kwadrat.obwod());
        System.out.println("Pole: " + kwadrat.pole());
        System.out.println(prostokat.nazwaFigury("prostokat"));
        System.out.println("Obwod: " + prostokat.obwod());
        System.out.println("Pole: " + prostokat.pole());
    }
}