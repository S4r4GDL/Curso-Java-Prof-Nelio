package modulo_4;

import java.util.Locale;

public class Saidas_Modulo_4 {
	
	public static void main(String[] args) {
		
		
		float x = (float) 130.42560;
		
		int y = 13;
		
		String name = "Sara";
		
		for(int i = 0; i < 10; i++)
			System.out.print("Sem quebra de linha " + i + " ");
		
		System.out.println("");
		
		for(int i = 0; i < 10; i++)
			System.out.println("Com quebra de linha " + i);
		
		
		System.out.print("Print: float = " + x + " int = " + y );
		
		System.out.printf("\nPrintf: float = %.2f int = %d", x, y);
		
		System.out.printf("\nPrintf: float = %.2f int = %d", x, y);
		
		System.out.printf("\nPrintf: name = %s age = %d", name, 21);
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("\n\nProducts:"
				+ "\n%s, which price is $ %.2f"
				+ "\n%s, which price is $ %.2f"
				+ "\n\nRecord: %d years old, code %d and gender: %c"
				+ "\n\nMeasure with eight decimal places: %.8f"
				+ "\nRounded (three  decimal places): %.3f"
				, product1, price1, product2, price2, age, code, gender, measure, measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("\nUS decimal point: %.3f", measure);
	}
	
}
