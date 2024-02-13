package module_8;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_Produtos_Modulo_8 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Product prod = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		prod.setName(input.nextLine());
		System.out.print("Price: ");
		prod.setPrice(input.nextDouble());
		System.out.print("Quantity in stock: ");
		prod.setQuantity(input.nextInt());
		
		System.out.println("Product data: " + prod);
		
		System.out.print("Enter the number of products to be added in stock: ");
		prod.addProducts(input.nextInt());
		System.out.println("Updated data: " + prod);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		prod.removeProducts(input.nextInt());
		System.out.println("Updated data: " + prod);
		
		
		input.close();
	}

}
