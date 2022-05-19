package vista;

import java.util.Scanner;

public class OXIIBucles {

	public OXIIBucles() {
		// Escribe un programa que calcule el factorial de un número entero leído por
		// teclado.
		Scanner leer = new Scanner(System.in);
		int numero = leer.nextInt();
		int factorial = 1;
		for (int i = 2; i < numero; i++) {
			factorial = i * factorial;
			System.out.println(factorial);
		}
	}

}
