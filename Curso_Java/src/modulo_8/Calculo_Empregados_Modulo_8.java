package modulo_8;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_Empregados_Modulo_8 {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name:");
		employee.setName(input.nextLine());
		System.out.print("Groos salary:");
		employee.setGroosSalary(input.nextDouble());
		System.out.print("Tax:");
		employee.setTax(input.nextDouble());
		
		System.out.printf("Employee: " + employee.toString());
		
		System.out.println("Which percentage to increase salary:");
		employee.increaseSalary(input.nextDouble());
		
		System.out.printf("Updated data: " + employee.toString());
		input.close();

	}

}
