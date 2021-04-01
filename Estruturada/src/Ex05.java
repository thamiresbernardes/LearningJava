import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Programa que dado tr�s medidas, calcula �reas de figuras geom�tricas! ");

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

        System.out.printf("A �rea do tri�ngulo de base A � : %.3f%n", triangulo);
        System.out.printf("A �rea do c�crulo de raio C � : %.3f%n", circulo);
        System.out.printf("a �rea do trap�zio de altura C : %.3f%n", trapezio);
        System.out.printf("A �rea do quadrado de base B � : %.3f%n", quadrado);
        System.out.printf("A �rea do ret�ngulo de lados A e B �: %.3f%n", retangulo);

        sc.close();
    }
}