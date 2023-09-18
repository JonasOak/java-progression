package entities;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	
	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	public void AddProducts(int quantidade) {
		this.quantity += quantidade;
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
			+ ", R$" + String.format("%.2f", price)
			+ ", quantidade: " + quantity
			+ ", total: R$" + String.format("%.2f", TotalValueInStock());
	}
	
}
