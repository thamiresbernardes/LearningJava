
import java.util.Locale;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Entre com as medidas do tri�ngulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do tri�ngulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p* (p-xA)*(p-xB)*(p-xC));
		
		double q = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(q* (q-yA)*(q-yB)*(q-yC));
		
		System.out.printf("A �rea do triangulo X � %.2f%n ", areaX);
		System.out.printf("A �rea do triangulo Y � %.2f%n", areaY);
		
		if (areaX < areaY) {
			System.out.println("A area do tri�ngulo Y � maior");}
		else {
			
			System.out.println("A area do tri�ngulo X � maior");}
		
		sc.close();		
	}

}