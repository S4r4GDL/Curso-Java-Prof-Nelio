package modulo_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Composition_Modulo_13 {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner input = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/YY");
		
		String name, department, level;
		Integer numContracts;
		Double income, baseSalary;
		
		
		System.out.print("Enter department's name:");
		department = input.nextLine();
		System.out.print("Enter worker data:\nName:");
		name = input.nextLine();
		System.out.print("Level:");
		level = input.nextLine();
		System.out.print("Base salary:");
		baseSalary = input.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("\nHow many contracts to this worker?");
		numContracts = input.nextInt();
		
		for (int i = 0; i < numContracts; i++) {
			input.nextLine();
			System.out.printf("Enter the contract #%d data:\nDate (DD/MM/YYYY):", i+1);
			Date date = format.parse(input.nextLine());
			
			System.out.print("Value per hour:");
			Double valuePerHour= input.nextDouble();
			
			System.out.print("Duration (hours):");
			Integer hours = input.nextInt();
			
			worker.addContract(new HourContract(date, valuePerHour, hours));
		}
		input.nextLine();
		System.out.print("Enter month and year to calculate income(MM/YYYY):");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(format.parse("01/" + input.nextLine()));
		income = worker.income(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH));
		
		System.out.printf("%s\nIncome for %d/%d: %.2f", 
				worker.toString(),
				calendar.get(Calendar.MONTH),
				calendar.get(Calendar.YEAR),
				income);
		
		input.close();
	}
}
