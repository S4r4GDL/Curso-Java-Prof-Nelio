package modulo_13;

public class OrderItem {
	private Integer quantity;
	private Product product;
	private Double price;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Product product, Double price) {
		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
