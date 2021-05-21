package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionarios;

public class Ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Funcionarios emp = new Funcionarios();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("salarioBruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Funcionarios: " + emp);
		System.out.println();
		System.out.print("Qual o percentual de aumento? ");
		double porcentagem = sc.nextDouble();
		emp.salarioPromocao(porcentagem);
		System.out.println();
		System.out.println("Atualiza: " + emp);
		sc.close();

	}

}
