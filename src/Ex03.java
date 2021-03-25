import java.util.Scanner;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double Largura, Comprimento, MetroQuadrado, Area, Preco;
        int num1, num2, num3, num4, Soma, Diferenca;

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

        System.out.println("Operações com números! ");
        System.out.println("Agora entre com o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Agora entre com o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Agora entre com o terceiro número: ");
        num3 = sc.nextInt();
        System.out.println("Agora entre com o quarto número: ");
        num4 = sc.nextInt();

        Soma = num1 + num2;
        Diferenca = ((num1 * num2) - (num3 * num4));

        System.out.println("A soma dos dois primeiros números é:" + Soma);
        System.out.println("A diferença do produto dos numeros é:" + Diferenca);

    }
}
