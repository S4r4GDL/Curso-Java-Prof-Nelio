package module_5;

import java.util.Locale;
import java.util.Scanner;

public class Estruturas_Condicionais_Modulo_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Double height;
		
		float weight;
		
		int age;
		
		
		
		System.out.println("Your age: ");
		
		do {
			
			age = input.nextInt();
			
			if(age < 1)
				System.out.println("You'r age must be min 1 max 140");
			
		}while(age < 1 || age > 140);
		
		
		if(age < 12)
			System.out.println("You'r a child");	
		else if(age < 18)
			System.out.println("You'r a teen");	
		else if(age >= 18)
			System.out.println("You'r an adult");	
				
		System.out.println("Your height \n(Format -> xx.xx): ");
		height = input.nextDouble();
				
		System.out.println("Your weight \n(Format -> xx.xx): ");
		weight = input.nextFloat();
		
		Double imc = imcCalculator(height, weight);
		
		System.out.println("Your IMC: " + imc.toString());
		
		String result = (imcValidate(imc))? "IMC OK"  : "IMC NOT OK";
		
		System.out.println(result + "\n");
		
		imcEscale(imc);
		
		
		
		input.close();

	}
	
	private static void imcEscale(Double imc) {
		
		if(imc <= 18.5)
			System.out.println("Underweight");
		else if(imc >= 18.6 && imc <= 24.9)
			System.out.println("Normal");
		else if(imc >= 25.0 && imc <= 29.9)
			System.out.println("Overweight");	
		else if(imc >= 30.0 && imc <= 34.9)
			System.out.println("Grade I obesity");
		else if(imc >= 30.0 && imc <= 39.9)
			System.out.println("Grade II obesity");
		else if(imc >= 40.0)
			System.out.println("Grade III obesity");	
	}

	private static boolean imcValidate(Double imc) {
		
		return (imc >= 18.6 && imc <= 24.9);
		
	}

	private static Double imcCalculator(Double height, float weight) {
		
		return weight/(Math.pow(height, 2));
		
	}

}
