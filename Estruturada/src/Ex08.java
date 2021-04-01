import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double preco, desconto;

        System.out.println("Entre com o preço do produto ");
        preco = sc.nextDouble();

        desconto = (preco < 35.0) ? preco * 0.01 : preco * 0.05;

        System.out.println("O valor do desconto é: " + desconto);
        sc.close();
    }
}