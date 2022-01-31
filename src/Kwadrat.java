// Zadanie 2
public class Kwadrat extends Figura {
    private double a;
    public Kwadrat(double a) { this.a = a; }
    @Override
    public double obwod() {
        return 4 * a;
    }
    @Override
    public double pole() {
        return a * a;
    }
}