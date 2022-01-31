public class Main {
    public static void main(String[] args) {
        // Zadanie 2c
        Kwadrat kwadrat = new Kwadrat(6);
        Prostokat prostokat = new Prostokat(5, 4);
        System.out.println(kwadrat.nazwaFigury("kwadrat"));
        System.out.println("Obwod: " + kwadrat.obwod());
        System.out.println("Pole: " + kwadrat.pole());
        System.out.println(prostokat.nazwaFigury("prostokat"));
        System.out.println("Obwod: " + prostokat.obwod());
        System.out.println("Pole: " + prostokat.pole());
    }
}