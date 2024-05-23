public class Main {
    public static void main(String[] args) {

        Heptagono miFigura3 = new Heptagono();
        Heptagono miFigura4 = new Heptagono(9.0, 4.0);
        System.out.println("\nArea y Perimetro del Heptagono");
        System.out.println("Area:");
        System.out.println(miFigura4.calcularArea());
        System.out.println("Perimetro:");
        System.out.println(miFigura4.calcularPerimetro());

        Octagono miFigura1 = new Octagono();
        Octagono miFigura2 = new Octagono(12.0, 6.0);
        System.out.println("Area y Perimetro del Octagono");
        System.out.println("Area:");
        System.out.println(miFigura2.calcularArea());
        System.out.println("Perimetro:");
        System.out.println(miFigura2.calcularPerimetro());

        Nonagono miFigura5 = new Nonagono();
        Nonagono miFigura6 = new Nonagono(12.0, 6.0);
        System.out.println("\nArea y Perimetro del Nonagono");
        System.out.println("Area:");
        System.out.println(miFigura6.calcularArea());
        System.out.println("Perimetro:");
        System.out.println(miFigura6.calcularPerimetro());

        Decagono miFigura7 = new Decagono();
        Decagono miFigura8 = new Decagono(9.0, 4.0);
        System.out.println("\nArea y Perimetro del Decagono");
        System.out.println("Area:");
        System.out.println(miFigura8.calcularArea());
        System.out.println("Perimetro:");
        System.out.println(miFigura8.calcularPerimetro());

        Endecagono miFigura9 = new Endecagono();
        Endecagono miFigura10 = new Endecagono(14.0, 8.0);
        System.out.println("\nArea y Perimetro del Endecagono");
        System.out.println("Area:");
        System.out.println(miFigura10.calcularArea());
        System.out.println("Perimetro:");
        System.out.println(miFigura10.calcularPerimetro());

        Dodecagono miFigura11 = new Dodecagono();
        Decagono miFigura12 = new Decagono(5.0, 3.0);
        System.out.println("\nArea y Perimetro del Dodecagono");
        System.out.println("Area:");
        System.out.println(miFigura12.calcularArea());
        System.out.println("Perimetro:");
        System.out.println(miFigura12.calcularPerimetro());
    }
}