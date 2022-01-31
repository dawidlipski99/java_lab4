import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        int[] tab = new int[] { 0, 0, 0, 0, 0, 0 };
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();

            try {
                int indeks = Integer.parseInt(input);
                System.out.println("OK1");
                if (indeks <= 0 || indeks > 99999)
                    throw new Exception();
                System.out.println("OK2");

                for (int i = 0; i < input.length(); i++)
                    tab[i] = Integer.parseInt(input.substring(i, i + 1));
                break;
            } catch (Exception e) {
                System.out.println("Niepoprawny indeks");
                continue;
            } finally {
                System.out.println("Finally");
            }
        }
        // Zadanie 2
        //a
        String test = null;
        try {
            char[] letters = test.toCharArray();
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        }
        //b
        int a = 0;
        int b = 2;
        try {
            int c = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }
        // Zadanie 3
        int d = 0;
        int e = 10;
        try {
            int f = e / d;
        } catch (ArithmeticException ex) {
            System.out.println("Catch 1");
        } catch (Exception ex) {
            System.out.println("Catch 2");
        } finally {
            System.out.println("Finally");
        }
    }
}