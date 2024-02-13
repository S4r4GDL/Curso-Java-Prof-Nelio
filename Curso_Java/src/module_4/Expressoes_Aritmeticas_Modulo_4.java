package module_4;

import java.util.Objects;
import java.util.Scanner;

public class Expressoes_Aritmeticas_Modulo_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double n1, n2, result;
		String signal;
		
		System.out.println("Set your problem: ex: \n 15,00\n -\n 160,859");
		
		n1 = input.nextDouble();
		
		signal = input.next();
		
		n2 = input.nextDouble();
		
		result = calculate(n1, n2, signal);
		
		if(Objects.nonNull(result))
			
			System.out.println(n1.toString() + " " + signal +  " " + n2.toString() + " = " + result);
		
		else
			System.out.println("Invalid !");
		
		input.close();

	}

	private static Double calculate(Double a, Double b, String signal) {
		
		switch(signal){
			
			case "+" :
				return a + b;
			case "-" :
				return a - b;
			case "/" :
				return a / b;
			case "*" :
				return a * b;
			default:
				return null;
		}
		
	}

}