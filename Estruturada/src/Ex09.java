import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
	
		public static void main(String[] args) {

	        Locale.setDefault(Locale.US);
	        
	        System.out.println("PROGRAMA QUE CALCULA O FATORIAL DE UM NÚMERO INFORMADO! ");

	        Scanner sc = new Scanner(System.in);

	        double x;     
	               
	                     
	        System.out.println("\n Digite um número e descubra o seu fatorial! ");
	        x = sc.nextDouble();	        
	        
	        double y = x;   
	        
	        while (x > 1){
	        	  y = y *(x-1); 
	        	  x--;
	        	                    }
	            
	           
	        System.out.println("O fatorial é:  "+y);
	        sc.close();
	    }
}