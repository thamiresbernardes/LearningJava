package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudante;

public class Ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante est = new Estudante();
		System.out.print("Name: ");
		est.name = sc.nextLine();
		System.out.print("NOTA 01: ");
		est.nota1 = sc.nextDouble();
		System.out.print("NOTA 02: ");
		est.nota2 = sc.nextDouble();
		System.out.print("NOTA 03: ");
		est.nota3 = sc.nextDouble();
		
		System.out.printf("A nota final é: %.2f%n ", est.notaFinal());
		if (est.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("Faltaram %.2f Pontos %n",est.pontosFaltantes());
		}
		else {
			System.out.println("APROVADO");
		}
		sc.close();

	}

}
