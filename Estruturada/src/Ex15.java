import java.util.Locale;
import java.util.Scanner;


public class Ex15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	    
    	Scanner sc = new Scanner(System.in);
    	
    	int x;
    	double num1, num2, num3, media;   	
    	
    	System.out.println("Digite a quantidade de casos que quer verificar: ");
    	x = sc.nextInt();
    	
    	media =0;
    	for (int i=1;i<=x;i++){
			System.out.println("Digite três números:");
    		num1 = sc.nextDouble();
    		num2 = sc.nextDouble();
    		num3 = sc.nextDouble();
    		media = ((num1*2)+(num2*3)+(num3*5))/10 ;
        	System.out.printf(" Médias ponderada dos números: %.2f%n" ,media);
    		
    		}
    	   	
    	sc.close();
    	}		    	
}