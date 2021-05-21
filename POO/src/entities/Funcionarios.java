package entities;

public class Funcionarios {

		public String name;
		public double salarioBruto;
		public double imposto;
		
		public double salarioLiquido() {
			return salarioBruto - imposto;
		}
		
		public void salarioPromocao(double porcentagem) {
			salarioBruto += salarioBruto * porcentagem / 100.0 ;
		}
		
		public String toString() {
			return name + ", R$"  + String.format("%.2f" , salarioLiquido());
		}
	}
