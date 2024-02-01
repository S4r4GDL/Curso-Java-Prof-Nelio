package Principal_Curso_Java;

import java.util.Objects;
import java.util.Scanner;

public class Funcoes_Matematicas_Modulo_4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Double n1, n2, result;
		char signal;
		
		System.out.println("Set your problem: ex: \n 15,00\n -\n 160,859\n"
				+ "Operations:\nADITION -> + "
				+ "\nSUBTRACTION -> -"
				+ "\nDIVISION -> /"
				+ "\nMULTIPLICATION -> *"
				+ "\nPERCENT -> %"
				+ "\nSQUARE ROOT -> S"
				+ "\nCUBIC ROOT -> C"
				+ "\nFACTORIAL -> !");
		
		n1 = input.nextDouble();
		
		signal = input.next().charAt(0);
		
		n2 = input.nextDouble();
		
		result = calculate(n1, n2, signal);
		
		if(Objects.nonNull(result))
			
			System.out.println(result.toString());
		
		else
			
			System.out.println("Invalid !");
		
		input.close();

	}

	private static Double calculate(Double a, Double b, char signal) {
		
		switch(signal){
			
			case '+' :
				return a + b;
			case '-' :
				return a - b;
			case '/' :
				return a / b;
			case '*' :
				return a * b;
			case '%' :
				return percent(a, b);
			case 'S' :
				return Math.sqrt(a);
			case 'C' :
				return Math.cbrt(a);
			case '!' :
				return factorial(a);
			default:
				return null;
		}
	}
		
	private static Double factorial(Double a) {
		
		
		Double result = 0.0;
		int i;
		
		for(i = 1; i <= a; i++)
			result += (Double) a*i;
			
		return result;
}

	private static Double percent(Double a, Double b) {
		
		return a/100 * b;
		
	}
		
}
