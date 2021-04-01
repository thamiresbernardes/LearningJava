import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Programa que informa o dia da semana, baseado em uma entrada!");

        Scanner sc = new Scanner(System.in);

        int diaSemana;
        String dia;

        System.out.println("Entre com um n�mero de 1 a 7: ");
        diaSemana = sc.nextInt();

        switch (diaSemana) {
        case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Ter�a";
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
            dia = "S�bado";
            break;
        default:
            dia = "N�mero inv�lido";
            break;
        }
        System.out.println("O dia da semana baseado no que voc� digitou �: " + dia);
        sc.close();
    }
}