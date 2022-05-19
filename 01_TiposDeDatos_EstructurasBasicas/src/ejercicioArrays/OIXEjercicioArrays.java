package ejercicioArrays;

import java.util.Scanner;

public class OIXEjercicioArrays {

	public OIXEjercicioArrays() {
		// 9.-Diseñar un programa en Java que permita declarar un array unidimensional
		// (vector) de 10 números enteros,
		// pida al usuario 10 números enteros para almacenarlos en dicho array y a
		// continuación pida un número para
		// comprobar cuantas veces aparece dicho número dentro del array.
		Scanner leer = new Scanner(System.in);
		int[] lista = new int[10];
		int numero;
		int contador = 0;// Contará el número de veces que aparece "número" en la lista de enteros
		for (int i = 0; i < lista.length; ++i) {
			System.out.println("\nIntroduzca el elemento número " + (i + 1) + ": ");
			lista[i] = leer.nextInt();
		}
		// Visualización de los datos de la lista
		System.out.println("\nLista de números enteros: ");
		for (int i = 0; i < lista.length; ++i) {
			System.out.println(lista[i] + " ");
		}
		System.out.println("Introduzca el número que desea buscar: ");
		numero = leer.nextInt();
		for (int i = 0; i < lista.length; ++i) {
			if (lista[i] == numero)
				++contador;
		}
		System.out.println("\nEl número de veces que aparece " + numero + " en la lista es: " + contador);
	}

}
