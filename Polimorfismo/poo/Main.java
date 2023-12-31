package Polimorfismo.poo;

public class Main {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(1.2, 3.5);
        Circulo c = new Circulo(3.3);
        Pentagono p = new Pentagono(10);

        System.out.println("Area rectangulo ==> " + r.calcularArea());
        System.out.println("Area circulo ==> " + c.calcularArea());
        System.out.println("Area pentagono ==> " + p.calcularArea());
    }
}
