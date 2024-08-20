package modulo_14;

public class ImportedProduct extends Product{
	private Double customsfee;
	
	
	public ImportedProduct(String name, Double price, Double customsfee) {
		super(name, price);
		this.customsfee = customsfee;
	}


	public ImportedProduct() {
	}


	public Double getCustomsfee() {
		return customsfee;
	}


	public void setCustomsfee(Double customsfee) {
		this.customsfee = customsfee;
	}

	public Double totalPrice() {
		return super.getPrice()+ getCustomsfee();
	}
	
	@Override
	public String priceTag() {
		return String.format("%s\nCustoms fee: %s", super.priceTag());
	}
	

}
