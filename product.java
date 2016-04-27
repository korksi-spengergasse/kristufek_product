public class Product() {
	private String name;
 	private int id;
	private float price;
	private boolean onStock;

	public Product(name, id, price, onStock) {
		setName(name);
		setId(id);
		setPrice(price);
		setOnStock(onStock);
	}

	public Product(name, id, price) {
		Product(name, id, price, true);
	}

	public Product(name, id) {
		Product(name, id, 10);
	}


	public Product(id) {
		Produt("Coca Cola", id);
	}

	public String getName() { return this.name; }
	public void setName(name) { this.name = name; }

	public int getId() { return this.id; }
	public void setId(id) { this.id = id; }

	public float getPrice() { return this.price; }
	public void setPrice(price) { this.price = price; }

	public boolean getOnStock() { return this.onStock; }
	public void setOnStock(onStock) { this.obStock = onStock; }
}

