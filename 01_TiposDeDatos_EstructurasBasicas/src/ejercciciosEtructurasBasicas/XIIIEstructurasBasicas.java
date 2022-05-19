package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XIIIEstructurasBasicas {

	public XIIIEstructurasBasicas() {
		// Dado un número entero positivo, calcular una lista de sus divisores, incluyendo a él
		// mismo. Al final del proceso se deberá indicar cuántos divisores son pares y cuántos impares.
		Scanner leer = new Scanner(System.in);
		int n = 36;
		int x = 1;
		int pares = 0;
		int impares = 0;

		do {
			if (n % x == 0) {
				System.out.println(+n + " es divisible entre " + x);
				if (x % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
			x++;

		} while (x < (n + 1));
		System.out.println("Pares" + pares);
		System.out.println("Impares" + impares);
		
		
		
        System.out.println("==================================================");


		pares = 0;
		x = 1;
		impares = 0;
		for (x = 1; x <= n; x++) {
			if (n % x == 0) {
				System.out.println(+n + " es divisible entre " + x);
				if (x % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}
		System.out.println("Pares" + pares);
		System.out.println("Impares" + impares);

	}

}
