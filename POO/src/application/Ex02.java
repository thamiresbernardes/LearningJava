package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rect.largura = sc.nextDouble();
		rect.comprimento = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();

	}

}
