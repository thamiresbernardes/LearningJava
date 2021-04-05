import java.util.Locale;
import java.util.Scanner;


public class Ex14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	    
    	Scanner sc = new Scanner(System.in);
    	
    	int x, c, f, y, in, out;   	
    	
    	System.out.println("Digite a quantidade de números que quer verificar: ");
    	x = sc.nextInt();
    	
    	System.out.println("Digite o intervalo que quer verificar: ");
    	c = sc.nextInt();
    	f = sc.nextInt();
    	
    	in = 0;
    	out = 0;
    	for (int i=1;i<=x;i++){
			System.out.println("Digite o número  ");
    		y = sc.nextInt();
    			if (y >= c && y<=f) {
    				in = in + 1; }                 	
    			else {
    				out = out + 1;
            } 
    		}
    	System.out.println(" Números digitados dentro do seu intervalo: "+in);
    	System.out.println(" Números digitados fora do seu intervalo: "+out);
    	   	
    	sc.close();
    	}		    	
}