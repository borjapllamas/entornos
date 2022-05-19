package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class VIEstructurasBasicas {

	public VIEstructurasBasicas() {
		// Mostrar los 20 números impares inmediatamente inferiores al 100, en orden
		// decreciente,
		// y al final, la suma de todos ellos.
		Scanner leer = new Scanner(System.in);
		int contador = 1;
		int suma = 0;
		String numeros = " ";
		System.out.println("Los 20 números inmediatamente inferiores al 100 son los siguientes :");
		for (int i = 100; (i > 1); i--) {

			if (i%2 != 0 && contador < 21) {
				numeros += "|";
				numeros += i;
				numeros += "| ";
				contador++;
				suma += i;
			}

		}
		System.out.println(numeros);
		System.out.println("La suma de todos ellos es : ");
	}
}
