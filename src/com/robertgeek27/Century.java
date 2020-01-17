package com.robertgeek27;

/**
 * 
 * @author robert
 *
 */
public class Century {

	public int centuryFromYear(int year) {
		int    res = ((year - 1) / 100) + 1;
		return res;
	}

	public static void main(String... args) {
		Century c = new Century();
		System.out.println(c.centuryFromYear(1701));
	}
}
