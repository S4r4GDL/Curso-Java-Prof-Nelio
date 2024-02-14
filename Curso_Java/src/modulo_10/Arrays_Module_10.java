package modulo_10;

import java.util.Scanner;

public class Arrays_Module_10 {
	//array->>homogeneo, ordenado, alocado 1x, acesso imediato, tam fixo, inserções e deleções 
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many people:");
		int quantity = input.nextInt();
		
		double[] heights = new double[quantity];
		
		for (int i = 0; i < quantity; i++) {
			heights[i] = input.nextDouble();
		}
		
		double avr = 0.0;
		for (int i = 0; i < quantity; i++) {
			avr += heights[i];
		}
		
		System.out.println(avr/(double)quantity);
		input.close();
	}
}
