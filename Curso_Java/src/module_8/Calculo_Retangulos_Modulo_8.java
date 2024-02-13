package module_8;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_Retangulos_Modulo_8 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the rectangle mesures:");
		System.out.print("Weight:");
		rectangle.setWeight(input.nextDouble());
		System.out.print("Height:");
		rectangle.setHeight(input.nextDouble());
		
		System.out.printf("AREA: %.2f\n"
				+ "PERIMETER: %.2f"
				+ "\nDIAGONAL: %.2f",
				rectangle.getArea(),
				rectangle.getPerimeter(),
				rectangle.getDiagonal());
		
		
		input.close();
		
	}
}
