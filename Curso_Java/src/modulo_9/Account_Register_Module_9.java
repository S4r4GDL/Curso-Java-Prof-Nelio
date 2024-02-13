package modulo_9;

import java.util.Scanner;

public class Account_Register_Module_9 {
 public static void main(String[] args) {
	 

	 Account account;
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter account number: ");
	 Integer actNum = input.nextInt();
	 input.nextLine();
	 
	 System.out.println("Enter account holder: ");
	 String name = input.nextLine();
	 
	 System.out.println("Is there an initial deposit?(Y/N) ");
	 if(input.next().charAt(0) == 'Y')
	 {
		 System.out.println("Enter initial deposit value: ");
		 account = new Account(actNum, name, input.nextDouble());
	 }
	 else
		 account = new Account(actNum, name);
	 
	 System.out.println("\nAccount data:\n" + account.toString());
	 
	 System.out.println("\nEnter a deposit value: ");
	 account.deposit(input.nextDouble());
	 System.out.println("\nUpdated account data:\n" + account.toString());
	 
	 System.out.println("\nEnter a withdraw value: ");
	 account.withdraw(input.nextDouble());
	 System.out.println("\nUpdated account data:\n" + account.toString());
	 
	 input.close();			
 }
}
