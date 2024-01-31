package Principal_Curso_Java;

import java.util.Locale;
import java.util.Scanner;


public class Entrada_de_dados_Modulo_4 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		Scanner input = new Scanner(System.in);
		
		String name;
		
		Double height;
		
		float weight;
		
		Integer age;
		
		System.out.println("Your name: ");
		name = input.next();
				
		System.out.println("Your age: ");
		age = input.nextInt();
				
		System.out.println("Your height \n(Format -> xx.xx): ");
		height = input.nextDouble();
				
		System.out.println("Your weight \n(Format -> xx.xx): ");
		weight = input.nextFloat();
		
		
		System.out.println("Your name: " + name + 
				"\nYour age: " + age + 
				"\nYour height: " +  height.toString() +
				"\nYour weight: "  + weight +
				"\nYour IMC: " + imcCalculator(height, weight).toString() );
		

	}
	private static Double imcCalculator(Double height, float weight) {
	
		return weight/(Math.pow(height, 2));
		
	}
}
