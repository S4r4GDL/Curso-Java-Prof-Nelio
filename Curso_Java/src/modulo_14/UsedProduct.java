package modulo_14;

import java.time.LocalDate;

public class UsedProduct extends Product {
	
	private LocalDate manufactoryDate;

	public UsedProduct(String name, Double price, LocalDate manufactoryDate) {
		super(name, price);
		this.manufactoryDate = manufactoryDate;
	}

	

	public UsedProduct() {
	}



	public LocalDate getManufactoryDate() {
		return manufactoryDate;
	}



	public void setManufactoryDate(LocalDate manufactoryDate) {
		this.manufactoryDate = manufactoryDate;
	}



	@Override
	public String priceTag() {
		return String.format("%s\nManufactory date: ", super.priceTag(), getManufactoryDate());
	}
	

	
}
