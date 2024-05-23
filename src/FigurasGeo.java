public class FigurasGeo {

    String nombre;
    int numLados;

    public FigurasGeo() {

    }

    public FigurasGeo(String nombre, int numLados) {
        this.nombre = nombre;
        this.numLados = numLados;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getNumLados() {
        return numLados;
    }


    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
}

