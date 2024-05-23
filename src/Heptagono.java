public class Heptagono extends FigurasGeo {
    private double lado;
    private double apotema;

    public Heptagono() {
        this.lado = 0.0;
        this.apotema = 0.0;
    }

    public Heptagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double calcularArea() {
        return (7 * lado * apotema) / 2;
    }

    public double calcularPerimetro() {
        return 7 * lado;
    }

    public double getLado() {
        return lado;
    }

    public double getApotema() {
        return apotema;
    }
}
