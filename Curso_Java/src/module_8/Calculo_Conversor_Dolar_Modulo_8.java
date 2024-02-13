package module_8;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_Conversor_Dolar_Modulo_8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
			System.out.print("What is the dollar price? ");
			CurrencyConverter conv = new CurrencyConverter(input.nextDouble());
			
			System.out.print("How many dollars will be bought? ");
			System.out.printf("Amount to be paid in reais = %.2f", conv.converter(input.nextDouble()));

			input.close();
	}

}
