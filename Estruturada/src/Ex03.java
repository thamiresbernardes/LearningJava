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

        System.out.printf("A Area total do projeto � %.2f%n", area);
        System.out.printf("E seu preco final ser� %.2f%n", preco);

        System.out.println("\n Opera��es com n�meros!");
        System.out.println("Agora entre com o primeiro n�mero: ");
        num1 = sc.nextInt();
        System.out.println("Agora entre com o segundo n�mero: ");
        num2 = sc.nextInt();
        System.out.println("Agora entre com o terceiro n�mero: ");
        num3 = sc.nextInt();
        if (num3 % 2 == 0) {
            System.out.println("O n�mero digitado � par ");
        } else {
            System.out.println("O n�mero digitado � �mpar ");
        }
        System.out.println("Agora entre com o quarto n�mero: ");
        num4 = sc.nextInt();
        if (num4 < 0) {
            System.out.println("O n�mero digitado � negativo ");
        } else {
            System.out.println("O n�mero digitado � positivo ");
        }

        soma = num1 + num2;
        diferenca = ((num1 * num2) - (num3 * num4));

        System.out.println("A soma dos dois primeiros n�meros �:" + soma);
        System.out.println("A diferen�a do produto dos numeros �:" + diferenca);
        System.out.println("A diferen�a do produto dos numeros �:" + diferenca);

        sc.close();

    }
}