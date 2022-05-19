package ejerciciosBucles;

import java.util.Scanner;

public class OVIIIBucles {

	public OVIIIBucles() {
		// Escribe un programa que obtenga los números enteros comprendidos entre dos
		// números introducidos por teclado y validados como distintos, el programa debe
		// empezar por el menor de los enteros introducidos e ir incrementando de 7 en
		// 7.
		Scanner leer = new Scanner(System.in);
		int primerNumero;
		int segundoNumero;
		do {
			System.out.print("Introduzca un número entero: ");
			primerNumero = leer.nextInt();
			System.out.print("Introduzca otro número entero distinto al anterior: ");
			segundoNumero = leer.nextInt();
			if (primerNumero == segundoNumero) {
				System.out.println("Los números introducidos no son válidos, deben ser distintos.");
			}
		} while (primerNumero == segundoNumero);
		if (primerNumero > segundoNumero) {
			int aux = primerNumero;
			primerNumero = segundoNumero;
			segundoNumero = aux;
		}
		for (int i = primerNumero; i <= segundoNumero; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
