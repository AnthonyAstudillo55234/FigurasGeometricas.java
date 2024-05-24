public class Pentagono extends figuras_geometricas
{
    Double lado;
    Double apotema;

    public Pentagono()
    {
        super("", 5, true);
    }


    public Pentagono(String nombre, int numero_lados, boolean regularidad, Double lado, Double apotema)
    {
        super(nombre, numero_lados, regularidad);
        this.lado = lado;
        this.apotema = apotema;
    }

    public int getNumeroLados() {return numero_lados;}
    public void setNumeroLados() {this.numero_lados = numero_lados;}

    public double getLado() {return lado;}

    public void setLado(double lado) {this.lado = lado;}

    public Double getApotema() {return apotema;}

    public void setApotema(Double apotema) {this.apotema = apotema;}

    public double perimetroPentagono(){return lado*numero_lados;}
    public Double areaPentagono(){return (perimetroPentagono()*apotema)/2;}

}
