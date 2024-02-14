package modulo_10;

import java.util.Scanner;

public class Matrices_Module_10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int w = input.nextInt();
		int count = 0;
		
		Integer[][] numbers = new Integer[h][w];
		
		for (int i = 0; i < numbers.length; i++)
			for (int j = 0; j < numbers[i].length; j++)
				numbers[i][j] = input.nextInt();
		
		
		System.out.println("Diagonal: ");
		for (int i = 0; i < numbers.length; i++)
			for (int j = 0; j < numbers[i].length; j++) {
				if(i==j)
					System.out.print(numbers[i][j] + " ");
				if(numbers[i][j] < 0)
					count++;
			}
		
		System.out.println("Negative numbers: " + count);
				
		input.close();
		
	}
	
}
