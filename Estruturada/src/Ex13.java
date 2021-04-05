import java.util.Locale;
import java.util.Scanner;


public class Ex13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	    
    	Scanner sc = new Scanner(System.in);
    	
    	int x;   	
    	
    	System.out.println("Digite um número e te falaremos quais são ímpares até chegar nele!");
    	x = sc.nextInt();
    	
    	
    	for (int i=1;i<=x;i++){
    		if (i % 2 != 0) {
                System.out.println(i);
            } 
    		}
    	   	
    	sc.close();
    	}		    	
}
