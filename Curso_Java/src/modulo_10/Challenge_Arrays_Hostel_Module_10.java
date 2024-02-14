package modulo_10;

import java.util.Scanner;

public class Challenge_Arrays_Hostel_Module_10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Client[] clients = new Client[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			input.nextLine();
			
			System.out.printf("\nRent #%d:\n", i);
			System.out.println("Name: ");
			String name = input.nextLine();
			System.out.println("Email: ");
			String email = input.nextLine();
			System.out.println("Room: ");
			int room = input.nextInt();
			clients[room] = new Client(room, name, email);
			System.out.println(clients[room].toString());
		}
		
		for (int i = 0; i < n; i++) {
			if(clients[i] != null)
				System.out.println(clients[i].toString());
		}
		
		input.close();
	}
	

}
