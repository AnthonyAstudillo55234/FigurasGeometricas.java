public class Hexagono extends FigurasGeo
{
    Double lado;
    Double apotema;

    public Hexagono() {}

    public Hexagono(Double lado, Double apotema)
    {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {return lado;}
    public void setLado(double lado) {this.lado = lado;}

    public Double getApotema() {return apotema;}
    public void setApotema(Double apotema) {this.apotema = apotema;}

    public double calcularPerimetro(){return lado*6;}
    public Double calcularArea(){return (calcularPerimetro()*apotema)/2;}

}