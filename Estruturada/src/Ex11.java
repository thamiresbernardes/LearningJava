import java.util.Locale;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    
    	System.out.println("PROGRAMA QUE CONTABILIZA USUARIOS NUM POSTO! ");
    	Scanner sc = new Scanner(System.in);
    	
    	int gasolina = 0;
    	int alcohol = 0;
    	int diesel = 0;
    	int tipo;
    	
    	
    	System.out.println("\n O cliente usou que tipo de combustível?\n Digite 1 para gasolina\n Digite 2 para Alcool "
    			+ "\n Digite 3 para diesel ou 4 para encerrar o expediente\n");
    	tipo = sc.nextInt();
    	
    	while (tipo != 4) {
    		if (tipo == 1) {
    			gasolina += 1;
    		}
    		else if (tipo == 2) {
    			alcohol += 1;
    		}
    		else if (tipo == 3) {
    			diesel += 1;
    		}
    		System.out.println("Digite o consumo do cliente ou 4 para sair:  ");
    		tipo = sc.nextInt();
    	}
    	
    	System.out.println("OBRIGADA! ");
    	System.out.println("Usuários gasolina: " +gasolina);
    	System.out.println("Usuários alcool: " +alcohol);
    	System.out.println("Usuários diesel: " +diesel);
    	
    	sc.close();
    		    	
	}

}
