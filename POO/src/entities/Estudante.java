package entities;

public class Estudante {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double mediaFinal() {
		return (nota1 + nota2 + nota3)/3;
	}
	
	public double pontosFaltantes() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		}
		else {
			return 0.0;
		}
	}
}
