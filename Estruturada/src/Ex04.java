import java.util.Scanner;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {

        System.out.println("Programa que dado o raio de um c�rculo nos informe sua �rea: ");

        Locale.setDefault(Locale.US);

        double raio, area, pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do c�rculo: ");
        raio = sc.nextDouble();

        area = (pi * (raio * raio));

        System.out.printf("A Area total do c�rculo � %.4f%n", area);
        sc.close();
    }

}