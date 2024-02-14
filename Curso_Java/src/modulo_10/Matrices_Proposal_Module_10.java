package modulo_10;

import java.util.Scanner;

public class Matrices_Proposal_Module_10 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int w = input.nextInt();
		
		
		Integer[][] numbers = new Integer[h][w];
		
		for (int i = 0; i < numbers.length; i++)
			for (int j = 0; j < numbers[i].length; j++)
				numbers[i][j] = input.nextInt();
		
		int num = input.nextInt();
		
		for (int i = 0; i < numbers.length; i++)
			
			for (int j = 0; j < numbers[i].length; j++) {	
				
				if(numbers[i][j] == num) {
					
					System.out.printf("Position: %d, %d\n", i, j);
					
					if(i-1 > -1)
						System.out.printf("Up: %d\n", numbers[i-1][j]);
					if(i+1 < numbers.length)
						System.out.printf("Down: %d\n", numbers[i+1][j]);
					if(j-1 > -1)
						System.out.printf("left: %d\n", numbers[i][j-1]);
					if(j+1 < numbers[i].length)
						System.out.printf("Up: %d\n", numbers[i][j+1]);
				}
					
			}
		
		input.close();

	}

}
