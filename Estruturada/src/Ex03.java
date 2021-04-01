import java.util.Scanner;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double largura, comprimento, metroQuadrado, area, preco;
        int num1, num2, num3, num4, soma, diferenca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a largura da parede a ser pintada: ");
        largura = sc.nextDouble();
        System.out.println("Entre com o comprimento da parede a ser pintada:");
        comprimento = sc.nextDouble();
        System.out.println("Quantos mestros quadrados tem o comodo? ");
        metroQuadrado = sc.nextDouble();
        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("A Area total do projeto é %.2f%n", area);
        System.out.printf("E seu preco final será %.2f%n", preco);

        System.out.println("\n Operações com números!");
        System.out.println("Agora entre com o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Agora entre com o segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Agora entre com o terceiro número: ");
        num3 = sc.nextInt();
        if (num3 % 2 == 0) {
            System.out.println("O número digitado é par ");
        } else {
            System.out.println("O número digitado é ímpar ");
        }
        System.out.println("Agora entre com o quarto número: ");
        num4 = sc.nextInt();
        if (num4 < 0) {
            System.out.println("O número digitado é negativo ");
        } else {
            System.out.println("O número digitado é positivo ");
        }

        soma = num1 + num2;
        diferenca = ((num1 * num2) - (num3 * num4));

        System.out.println("A soma dos dois primeiros números é:" + soma);
        System.out.println("A diferença do produto dos numeros é:" + diferenca);
        System.out.println("A diferença do produto dos numeros é:" + diferenca);

        sc.close();

    }
}