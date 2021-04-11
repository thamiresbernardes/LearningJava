package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estoque;

public class Ex01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Estoque estoque = new Estoque();
		System.out.println("Entre com a informação do produto:");
		System.out.println("Nome: ");
		estoque.name = sc.nextLine();
		System.out.print("Preço: ");
		estoque.price = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		estoque.quanti = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto:" +	estoque);
		System.out.println("Entre com a quantidade que será adicionada no estoque:");
		int newQuanti = sc.nextInt();
		estoque.addProduto(newQuanti);
		
		System.out.println();
		System.out.println("Dados atualizados:" +	estoque);
		System.out.println();
		
		System.out.println("Entre com a quantidade que será removida no estoque:");
		newQuanti = sc.nextInt();
		estoque.removeProduto(newQuanti);
		
		System.out.println();
		System.out.println("Dados atualizados:" +	estoque);
		
		sc.close();
	}

}
