import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        double Largura, Comprimento, MetroQuadrado, Area, Preco;

        Scanner sc = new Scanner(System.in);

        Largura = sc.nextDouble();
        Comprimento = sc.nextDouble();
        MetroQuadrado = sc.nextDouble();
        Area = Largura * Comprimento;
        Preco = Area * MetroQuadrado;

        System.out.printf("Area %.2f%n", Area);
        System.out.printf("Preco %.2f%n", Preco);
    }
}
