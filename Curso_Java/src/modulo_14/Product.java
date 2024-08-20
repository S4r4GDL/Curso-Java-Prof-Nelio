package modulo_14;

public class Product {
	private String  name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public Product() {
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String priceTag() {
		return new StringBuilder(
				String.format("Product type: %s\n Name: %s\n Price: %1.2f",
						this.getClass().getSimpleName(),
						getName(),
						getPrice()))
				.toString();
	}
}
