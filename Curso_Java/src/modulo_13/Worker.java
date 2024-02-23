package modulo_13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts;
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		contracts = new ArrayList<HourContract>();
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		Double result = baseSalary;
		
		for (HourContract hourContract : contracts) {
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(hourContract.getDate());
			
			if(calendar.get(Calendar.MONTH) == month && calendar.get(Calendar.YEAR) == year)
				result += hourContract.totalValue();
		}
		
		return result;
		
	}
	
	public String toString() {
		return "Name: " + name + "\nDepartment: " + department.getName();
	}
}
