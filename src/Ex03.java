import java.util.Scanner;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double Largura, Comprimento, MetroQuadrado, Area, Preco;
        int num1, num2, Soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a largura da parede a ser pintada: ");
        Largura = sc.nextDouble();
        System.out.println("Entre com o comprimento da parede a ser pintada:");
        Comprimento = sc.nextDouble();
        System.out.println("Quantos mestros quadrados tem o comodo? ");
        MetroQuadrado = sc.nextDouble();
        Area = Largura * Comprimento;
        Preco = Area * MetroQuadrado;

        System.out.printf("A Area total do projeto é %.2f%n", Area);
        System.out.printf("E seu preco final será %.2f%n", Preco);

        System.out.println("Agora entre com um número: ");
        num1 = sc.nextInt();
        System.out.println("Agora entre com outro número: ");
        num2 = sc.nextInt();

        Soma = num1 + num2;

        System.out.println("A soma dos dois números é:" + Soma);

    }
}
