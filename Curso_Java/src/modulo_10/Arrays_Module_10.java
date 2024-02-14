package modulo_10;

import java.util.Locale;
import java.util.Scanner;

public class Arrays_Module_10 {
	//array->>homogeneo, ordenado, alocado 1x, acesso imediato, tam fixo, inserções e deleções 
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many people:");
		int quantity = input.nextInt();
		
		double[] heights = new double[quantity];
		
		for (int i = 0; i < heights.length; i++) {
			heights[i] = input.nextDouble();
		}
		
		double avg = 0.0;
		for (int i = 0; i < heights.length; i++) {
			avg += heights[i];
		}
		avg /= (double)quantity;
		System.out.printf("%.2f", avg);
		input.close();
	}
}
