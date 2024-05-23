public class Nonagono extends FigurasGeo {
    private double lado;
    private double apotema;

    public Nonagono() {
        this.lado = 0.0;
        this.apotema = 0.0;
    }

    public Nonagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double calcularArea() {
        return (9 * lado * apotema) / 2;
    }

    public double calcularPerimetro() {
        return 9 * lado;
    }

    public double getLado() {
        return lado;
    }

    public double getApotema() {
        return apotema;
    }
}