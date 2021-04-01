import java.util.Locale;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    
    	Scanner sc = new Scanner(System.in);
    	
    	int x,y;    	
    	
    	System.out.println("Operação com números. Quantos números você deseja?");
    	x = sc.nextInt();
    	
    	int soma = 0;
    	int mult = 1;
    	
    	for (int i=1;i<=x;i++){
    			System.out.println("Digite o número  ");
        		y = sc.nextInt();
        		soma += y; 
        		mult = mult * y;
    		}
    	
    	System.out.println("A soma dos números é:" +soma);
    	System.out.println("A multiplicação dos números é:" +mult);
    	
    	sc.close();
    	}		    	
}
