package module_9;

public class Account {
	private Integer accountNum;
	private String holderName;
	private double balance;
	private static double TAX = 5.0;
	
	public Account() {
		
	}

	public Account(Integer numAccount, String holderName) {
		this.accountNum = numAccount;
		this.holderName = holderName;
	}

	public Account(Integer numAccount, String holderName, double balance) {
		this.accountNum = numAccount;
		this.holderName = holderName;
		deposit(balance);
	}
	
	
	public Integer getNumAccount() {
		return accountNum;
	}


	public String getName() {
		return holderName;
	}
	
	public void setName(String name) {
		this.holderName = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		
		if(balance > 0 && balance >= value)
			balance -= value + TAX;
		else
			System.out.println("Account says: Withdraw not accepted!");
	}
	
	public String toString() {
		return "Account " 
				+ accountNum 
				+ ", Holder: "
				+ holderName
				+ ", Balance: "
				+ String.format("%.2f", balance);
	}
	
}
