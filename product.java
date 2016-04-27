public class Product() {
	private String name;
	private float price;
	private boolean onStock;

	public Product(name, price, onStock) {
		setName(name);
		setPrice(price);
		setOnStock(onStock);
	}

	public Product(name, price) {
		Product(name, price, true);
	}

	public Product(name) {
		Product(name, 10);
	}


	public Product() {
		Produt("Coca Cola");
	}

	public String getName() { return this.name; }
	public void setName(name) { this.name = name; }

	public float getPrice() { return this.price; }
	public void setPrice(price) { this.price = price; }

	public boolean getOnStock() { return this.onStock; }
	public void setOnStock(onStock) { this.obStock = onStock; }
}

