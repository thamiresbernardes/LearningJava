import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
	
		public static void main(String[] args) {

	        Locale.setDefault(Locale.US);

	        Scanner sc = new Scanner(System.in);

	        int x;
	        
	                     
	        System.out.println("Digite um número ");
	        x = sc.nextInt();
	        	        
	        int soma = 0;
	        while (x!=0) {
	        	soma += x;
	        	System.out.println("Digite outo número. Se desejar parar, digite zero ");
	        	x = sc.nextInt();
	        }

	        	        
	        System.out.println("As somas dos numeros: " +soma);
	        sc.close();
	    }
}