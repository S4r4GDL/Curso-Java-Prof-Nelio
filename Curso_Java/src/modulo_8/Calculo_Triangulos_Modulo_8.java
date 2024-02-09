package principal_curso_java_md8_ao_md16;

import java.util.Scanner;

public class Calculo_Triangulos_Modulo_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Triangle x measures:");
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		
		System.out.println("Triangle y measures:");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		if(x.area() > y.area())
			System.out.println("X is the Bigger");
		else if (x.area() < y.area())
			System.out.println("Y is the Bigger");
		else
			System.out.println("Same size");
		
		input.close();

	}

}
