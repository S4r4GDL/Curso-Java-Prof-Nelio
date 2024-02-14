package modulo_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class List_Employees_Module_10 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		List <Employee> employeeList = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = input.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.print("\nEmployee #" + i + ":\nId: ");
			Integer id = input.nextInt();
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Salary: ");
			Double salary = input.nextDouble();
			employeeList.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = input.nextInt();
		
		Employee employee = employeeList.stream().filter(emp -> emp.getId() == id).findAny().orElse(null);
		
		if(employee != null)
		{
			System.out.print("Enter the percentage: ");
			Double pct = input.nextDouble();
			employee.increaseSalary(pct);
			
		}
		else
			System.out.print("The employee ID is invalid!");
		
		System.out.println();
		
		for (Employee emp : employeeList) {
			System.out.println(emp.toString());
		}
		
		input.close();
	}
}
