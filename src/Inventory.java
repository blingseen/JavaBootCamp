
public abstract class Inventory {
	private String name;
	private int quantity;
	private double price;
	public Inventory(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Inventory [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
}
