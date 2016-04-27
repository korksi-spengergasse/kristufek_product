public class Product() {
	private String name;
	private float price;

	public Product(name, price) {
		setName(name);
		setPrice(price);
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
}
