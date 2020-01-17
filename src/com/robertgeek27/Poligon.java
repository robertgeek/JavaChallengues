package com.robertgeek27;

/**
 * @author robert
 *
 */
public class Poligon {

	public static void main(String... args) {
		Poligon p = new Poligon();
		System.out.println(p.poligon(10));
	}

	/**
	 * @param n
	 * @return
	 */
	public int poligon(int n) {
		return (n * n) + ((n - 1) * (n - 1));
	}
}
