public class Octagono extends FigurasGeo {
    private double lado;
    private double apotema;

    public Octagono() {
        this.lado = 0.0;
        this.apotema = 0.0;
    }

    public Octagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double calcularArea() {
        return (4 * lado * apotema) / 2;
    }

    public double calcularPerimetro() {
        return 8 * lado;
    }

    public double getLado() {
        return lado;
    }

    public double getApotema() {
        return apotema;
    }
}