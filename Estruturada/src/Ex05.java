import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Programa que dado três medidas, calcula áreas de figuras geométricas! ");

        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Entre com a medida A: ");
        A = sc.nextDouble();
        System.out.println("Entre com a medida B: ");
        B = sc.nextDouble();
        System.out.println("Entre com a medida C: ");
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("A área do triângulo de base A é : %.3f%n", triangulo);
        System.out.printf("A área do cícrulo de raio C é : %.3f%n", circulo);
        System.out.printf("a área do trapézio de altura C : %.3f%n", trapezio);
        System.out.printf("A área do quadrado de base B é : %.3f%n", quadrado);
        System.out.printf("A área do retângulo de lados A e B é: %.3f%n", retangulo);

        sc.close();
    }
}