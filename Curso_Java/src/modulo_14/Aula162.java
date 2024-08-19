package modulo_14;

import java.util.ArrayList;
import java.util.List;

public class Aula162 {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Jose", 120, 40.00);
		OutsourceEmployee employee2 = new OutsourceEmployee("Amanda", 200, 150.00, 50.00);
		
		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.stream().forEach(emp -> {
			System.out.println(String.format("Name: %s\nPayment: %1.2f", emp.getName(), emp.payment()));
		});;

	}

}
