package entities;

public class Estoque {

	public String name;
	public double price;
	public int quanti;
	
	public double totalEstoque() {
		return price * quanti;
	}
	public void addProduto(int quanti) {
		this.quanti += quanti;
		}
	public void removeProduto(int quanti) {
		this.quanti -= quanti;
		}
	public String toString() {
		return name +", " + "$ " + String.format("%.2f", price) + ", "+ quanti + " Total: " + String.format("%.2f", totalEstoque());
	}
}
