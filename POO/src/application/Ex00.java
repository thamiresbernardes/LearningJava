package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Ex00 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medidas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p* (p-x.a)*(p-x.b)*(p-x.c));
		
		double q = (y.a + y.b+ y.c) / 2.0;
		double areaY = Math.sqrt(q* (q-y.a)*(q-y.b)*(q-y.c));
		
		System.out.printf("A �rea do triangulo X � %.2f%n ", areaX);
		System.out.printf("A �rea do triangulo Y � %.2f%n", areaY);
		
		if (areaX < areaY) {
			System.out.println("A area do tri�ngulo Y � maior");}
		else {
			
			System.out.println("A area do tri�ngulo X � maior");}
		
		sc.close();		
	}

}
