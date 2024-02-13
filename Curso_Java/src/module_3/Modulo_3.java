package module_3;

import java.util.Scanner;

public class Modulo_3{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.println("Olá, qual o seu nome?");
		
		name = input.nextLine();
		
		System.out.println("Olá " + name.toUpperCase());
		input.close();
	}

}
