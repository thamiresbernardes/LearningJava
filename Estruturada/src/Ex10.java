import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
    
    	System.out.println("PROGRAMA QUE VERIFICA SE VOC� SABE EM QUE ANO EST�! ");
    	Scanner sc = new Scanner(System.in);
    	
    	int x = 2022;
    	int y;
    	
    	System.out.println("Em que ano estamos? ");
    	y = sc.nextInt();
    	
    	
    	while (y != x) {
        	System.out.println("Voc� errou, tente novamente! ");
        	y = sc.nextInt();
    	}
    	System.out.println("Isso ai, voc� n�o est� perdida na quarentena!");
    	sc.close();
	}
}
