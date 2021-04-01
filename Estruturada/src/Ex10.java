import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
    
    	System.out.println("PROGRAMA QUE VERIFICA SE VOCÊ SABE EM QUE ANO ESTÁ! ");
    	Scanner sc = new Scanner(System.in);
    	
    	int x = 2022;
    	int y;
    	
    	System.out.println("Em que ano estamos? ");
    	y = sc.nextInt();
    	
    	
    	while (y != x) {
        	System.out.println("Você errou, tente novamente! ");
        	y = sc.nextInt();
    	}
    	System.out.println("Isso ai, você não está perdida na quarentena!");
    	sc.close();
	}
}
