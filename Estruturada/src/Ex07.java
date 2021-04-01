import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Programa que informa o dia da semana, baseado em uma entrada!");

        Scanner sc = new Scanner(System.in);

        int diaSemana;
        String dia;

        System.out.println("Entre com um número de 1 a 7: ");
        diaSemana = sc.nextInt();

        switch (diaSemana) {
        case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sábado";
            break;
        default:
            dia = "Número inválido";
            break;
        }
        System.out.println("O dia da semana baseado no que você digitou é: " + dia);
        sc.close();
    }
}