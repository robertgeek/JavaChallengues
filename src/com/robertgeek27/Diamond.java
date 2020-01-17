package com.robertgeek27;

import java.util.Scanner;

/**
 * This class create a Diamond with Strings
 * 
 * @author robert
 *
 */
public class Diamond {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Diamond diamondString = new Diamond();
		
		System.out.println("Give a number for create the diamond");
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();

		if (number > 1000) {
			System.out.println("The diamond is very big");
			return;
		}

		diamondString.printDiamond(number);
	}

	public void printDiamond(int number) {

		if (number % 2 == 0) {
			number++;
		}

		StringBuilder aux = new StringBuilder(number);

		for (int i = 0; i < number; i++) {
			aux.append(' ');
		}

		for (int i = 0; i < (number / 2) + 1; i++) {
			
			if (i == 0) {
				aux.setCharAt(number / 2, '*');
			}
			
			aux.setCharAt((number / 2) + i, '*');
			aux.setCharAt((number / 2) - i, '*');
			
			System.out.println(aux);
		}

		for (int i = 0; i < number; i++) {
			
			aux.setCharAt(i, ' ');
			aux.setCharAt((number - 1) - i, ' ');
			
			System.out.println(aux);
		}
	}
}
