package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XIIEstructurasBasicas {

	public XIIEstructurasBasicas() {
		// Dados dos números enteros positivos, hallar el mínimo común múltiplo. Método
		// a usar:
		// Se van hallando los sucesivos múltiplos del mayor de ellos hasta encontrar
		// uno que sea
		// divisible por el más pequeño.
		Scanner leer = new Scanner(System.in);
		int mayor, menor, cambio, contador = 2, mcm;
		System.out.println("Introduzca el primer número : ");
		mayor = leer.nextInt();
		System.out.println("Introduzca el segundo número : ");
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
