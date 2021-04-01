import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Programa que informa se é manhã, tarde ou noite.");

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Entre com a hora do dia: ");
        hora = sc.nextInt();

        if (hora > 24) {
            System.out.println("Você precisa digitar um número entre 0 e 24! ");
        } else if (hora >= 6 && hora < 12) {
            System.out.println("Bom dia! ");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde! ");
        } else {
            System.out.println("Boa noite! ");
        }
        sc.close();
    }
}