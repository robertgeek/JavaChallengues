package com.robertgeek27;

import java.util.Scanner;

/**
 * This class check if a word is Palindromo
 * If is Palindromo you can read the same word left to right or right to left
 * @author robert
 *
 */
public class Palindromo {

	public boolean checkPalindromo(String word) {
		int size = word.length();
		for (int i = 0; i < size / 2; i++) {
			if (word.charAt(i) != word.charAt(size - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String... args) {
		Palindromo p     = new Palindromo();
		Scanner    input = new Scanner(System.in);
		String     wordToCheck = input.next().toLowerCase();
		
		System.out.println(p.checkPalindromo(wordToCheck));
	}
}
