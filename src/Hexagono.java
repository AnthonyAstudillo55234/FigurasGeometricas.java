public class Hexagono extends figuras_geometricas
{
    Double lado;
    Double apotema;

    public Hexagono()
    {
        super("",6,true);
    }

    public Hexagono(String nombre, int numero_lados, boolean regularidad, Double lado, Double apotema)
    {
        super(nombre,6, regularidad);
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {return lado;}
    public void setLado(double lado) {this.lado = lado;}

    public Double getApotema() {return apotema;}
    public void setApotema(Double apotema) {this.apotema = apotema;}

    public int getNumeroLados(){return numero_lados;}
    public void setNumeroLados() {this.numero_lados = numero_lados;}

    public double perimetroPentagono(){return lado*numero_lados;}
    public Double areaPentagono(){return (perimetroPentagono()*apotema)/2;}

}