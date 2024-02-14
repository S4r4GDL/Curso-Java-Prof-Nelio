package modulo_10;

import java.util.Scanner;

public class Challenge_Arrays_Hostel_Module_10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Client[] clients = new Client[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\nRent #%d:\n", i);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.print("Email: ");
			String email = input.nextLine();
			
			System.out.print("Room: ");
			int room = input.nextInt();
			clients[room] = new Client(room, name, email);
			System.out.println(clients[room].toString());
		}
		
		System.out.println();
		System.out.println("Busy rooms");
		for (int i = 0; i < 10; i++) {
			if(clients[i] != null)
				System.out.println(clients[i]);
		}
		
		input.close();
	}
	

}
