import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        String nome;
        int nota1, nota2, nota3;
        double media;

        System.out.println("Digite o nome do aluno");
        Scanner sc = new Scanner(System.in);
        nome = sc.next();

        System.out.println("Digite a nota da primeira prova: ");
        nota1 = sc.nextInt();

        System.out.println("Digite a nota da segunda prova: ");
        nota2 = sc.nextInt();

        System.out.println("Digite a nota da terceira prova: ");
        nota3 = sc.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("nome do aluno: " + nome);
        System.out.println("Media: " + media);
    }
}
