package module_8;

public class Employee {
	String name;
	double groosSalary;
	double tax;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGroosSalary(double groosSalary) {
		this.groosSalary = groosSalary;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGroosSalary() {
		return groosSalary;
	}
	
	public double getTax() {
		return tax;
	}
	
	public double netSalary() {
		return groosSalary - tax;
	}
	
	public void increaseSalary(double percentage ) {
		groosSalary += groosSalary * (percentage/100.0);
	}
	
	public String toString() {
		return name + 
				", $" + 
				String.format("%.2f", netSalary());
		
	}
}
