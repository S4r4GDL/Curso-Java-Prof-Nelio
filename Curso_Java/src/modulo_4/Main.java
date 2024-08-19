package modulo_4;
import java.util.Scanner;

interface Employee {
    double calculateSalary();
}

interface ContractType {
	public double getSalary();
}

class CLTEmployee implements Employee {
    private final ContractType contractType;
    public CLTEmployee(ContractType contractType) {
        this.contractType = contractType;
    }
    @Override
    public double calculateSalary() {
        return contractType.getSalary();
    }
}

class PJEmployee implements Employee {
	private final ContractType contractType;
    public PJEmployee(ContractType contractType) {
        this.contractType = contractType;
    }
    @Override
    public double calculateSalary() {
        return contractType.getSalary();
    }
}

class CLT implements ContractType {
    private final double baseSalary;
    private final double commissions;
    public CLT(double baseSalary, double commissions) {
        this.baseSalary = baseSalary;
        this.commissions = commissions;
    }
    @Override
    public double getSalary() {
        return baseSalary + commissions;
    }
}

class PJ implements ContractType {
	
	private final double hours;
    private final double hourValue;
    public PJ(double hours, double hourValue) {
        this.hours = hours;
        this.hourValue = hourValue;
    }
    @Override
    public double getSalary() {
        return hours * hourValue;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractType = scanner.nextLine();
        
        String[] input = scanner.nextLine().split(",");
        double firstValue = Double.parseDouble(input[0]);
        double secondValue = Double.parseDouble(input[1]);
        
        if (contractType.equalsIgnoreCase("CLT")) {
            ContractType cltContract = new CLT(firstValue, secondValue);
            Employee cltEmployee = new CLTEmployee(cltContract);
            System.out.println("CLT: " + cltEmployee.calculateSalary());
        }
        else if (contractType.equalsIgnoreCase("PJ")) {
            ContractType pjContract = new PJ(firstValue, secondValue);
            Employee pjEmployee = new PJEmployee(pjContract);
            System.out.println("PJ: " + pjEmployee.calculateSalary());
        }
        scanner.close();
    }
}