package modulo_10;
import java.util.Locale;
import java.util.Scanner;

import modulo_8.Product;

public class Arrays_Products_Module_10 {
	
		//array->>homogeneo, ordenado, alocado 1x, acesso imediato, tam fixo, inserções e deleções 
		
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
					
			System.out.println("How many products:");
			int quantity = input.nextInt();
			
			Product[] products = new Product[quantity];
			
			for (int i = 0; i < quantity; i++) {
				products[i] = new Product();
				input.nextLine();
				System.out.println("Name:");
				products[i].setName(input.nextLine());
				System.out.println("Price:");
				products[i].setPrice(input.nextDouble());
				System.out.println("Quantity:");
				products[i].setQuantity(input.nextInt());
			}
			
			double avg = 0.0;
			for (int i = 0; i < quantity; i++) {
				avg += products[i].getPrice();
			}
			
			avg /= (double)quantity;
			System.out.printf("AVERAGE PRICE: %.2f", avg);
			input.close();
		}
		
}
