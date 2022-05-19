package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XIIEstructurasBasicas {

	public XIIEstructurasBasicas() {
		// Dados dos n�meros enteros positivos, hallar el m�nimo com�n m�ltiplo. M�todo
		// a usar:
		// Se van hallando los sucesivos m�ltiplos del mayor de ellos hasta encontrar
		// uno que sea
		// divisible por el m�s peque�o.
		Scanner leer = new Scanner(System.in);
		int mayor, menor, cambio, contador = 2, mcm;
		System.out.println("Introduzca el primer n�mero : ");
		mayor = leer.nextInt();
		System.out.println("Introduzca el segundo n�mero : ");
		menor = leer.nextInt();
		if (mayor < menor) {
			cambio = mayor;
			mayor = menor;
			menor = cambio;
		}
		do {
			mcm = mayor * contador;
			contador++;
		} while (mcm % menor != 0);
		System.out.println("El mcm es " + mcm);
	}

}
