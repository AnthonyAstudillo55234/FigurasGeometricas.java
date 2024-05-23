public class Decagono extends FigurasGeo {
    Double lado;
    Double apotema;

    public Decagono() {}

    public Decagono(Double lado, Double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
    public Decagono(String nombre, int nLados, Double longitudes) {
        super(nombre, nLados);
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public double calcularArea() {
        return (10 * apotema * lado)/2;
    }

    public double calcularPerimetro() {
        return 10 * lado;
    }
}