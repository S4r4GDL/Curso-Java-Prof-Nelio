package modulo_13;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private List<HourContract> contracts;
	
	public Worker(String name, WorkerLevel level) {
		this.name = name;
		this.level = level;
		contracts = new ArrayList<HourContract>();
	}

	public Worker(String name, WorkerLevel level, Double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		contracts = new ArrayList<HourContract>();
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
		return null;
		
	}
}
