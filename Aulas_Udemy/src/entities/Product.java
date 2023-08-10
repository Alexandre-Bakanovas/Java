package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	//essa função já é implícita no println, então não é necessário chama-la na hora que vai
//	printar algo na tela com a variavel product
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " 
	+ String.format("%.2f", totalValueInStock());
			
		
	}
}
