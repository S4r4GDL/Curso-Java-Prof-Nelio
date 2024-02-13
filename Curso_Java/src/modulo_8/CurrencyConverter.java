package modulo_8;

public class CurrencyConverter {
	private static double IOF = 0.06;
	private double dolarPrice;
	
	public CurrencyConverter(double dolarPrice) {
		this.dolarPrice = dolarPrice;
	}
	
	public double converter(double value) {
		return (dolarPrice + (dolarPrice * IOF)) * value ;
	}
	
}
