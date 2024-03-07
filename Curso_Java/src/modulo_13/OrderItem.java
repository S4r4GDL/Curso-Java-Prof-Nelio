package modulo_13;

public class OrderItem {
	private Integer quantity;
	private Product product;
	
	public OrderItem() {
		this.quantity = 0;
	}

	public OrderItem(Integer quantity, Product product, Double price) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void addQuantity(Integer quantity) {
		this.quantity += quantity;
	}
	
	public void removeQuantity(Integer quantity) {
		this.quantity -= quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal(){
		return product.getPrice() * quantity;
	}
	
	
	
	
}
