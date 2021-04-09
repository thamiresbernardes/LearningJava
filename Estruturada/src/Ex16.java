
import java.util.Locale;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Entre com as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p* (p-xA)*(p-xB)*(p-xC));
		
		double q = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(q* (q-yA)*(q-yB)*(q-yC));
		
		System.out.printf("A área do triangulo X é %.2f%n ", areaX);
		System.out.printf("A área do triangulo Y é %.2f%n", areaY);
		
		if (areaX < areaY) {
			System.out.println("A area do triângulo Y é maior");}
		else {
			
			System.out.println("A area do triângulo X é maior");}
		
		sc.close();		
	}

}