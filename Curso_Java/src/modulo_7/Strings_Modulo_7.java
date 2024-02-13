package modulo_7;

import java.util.Scanner;

public class Strings_Modulo_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Text ex ( BIRD-DOG-CAT-RACCOON-FISH || hello-world:\n");
		String text1 = input.nextLine();
		
		String[] text2 = text1.split("-");
		
		System.out.println("First index: " + text2[0]);
		
		String text3 = " ABC DEF ghi jkl ";
		
		System.out.println("toUpperCase: " + text3.toUpperCase());
		System.out.println("toLowerCase: " + text3.toLowerCase());
		System.out.println("trim: " + "-" + text3.trim() + "-");
		
		input.close();
		
	
		
	}

}
