package ejerciciosBucles;

import java.util.Scanner;

public class OXII {

	public OXII() {
		// TODO Auto-generated constructor stub
		// Escribe un programa que calcule el factorial de un número entero leído por
		// teclado.
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un número mayor que 1");
		int numero = leer.nextInt();
		int factorial = 1;
		for (int i = 2; i < numero; i++) {
			factorial = i * factorial;
			System.out.println(factorial);
		}
	}

}
