package ejercicioArrays;

import java.util.Scanner;

public class OIXEjercicioArrays {

	public OIXEjercicioArrays() {
		// 9.-Dise?ar un programa en Java que permita declarar un array unidimensional
		// (vector) de 10 n?meros enteros,
		// pida al usuario 10 n?meros enteros para almacenarlos en dicho array y a
		// continuaci?n pida un n?mero para
		// comprobar cuantas veces aparece dicho n?mero dentro del array.
		Scanner leer = new Scanner(System.in);
		int[] lista = new int[10];
		int numero;
		int contador = 0;// Contar? el n?mero de veces que aparece "n?mero" en la lista de enteros
		for (int i = 0; i < lista.length; ++i) {
			System.out.println("\nIntroduzca el elemento n?mero " + (i + 1) + ": ");
			lista[i] = leer.nextInt();
		}
		// Visualizaci?n de los datos de la lista
		System.out.println("\nLista de n?meros enteros: ");
		for (int i = 0; i < lista.length; ++i) {
			System.out.println(lista[i] + " ");
		}
		System.out.println("Introduzca el n?mero que desea buscar: ");
		numero = leer.nextInt();
		for (int i = 0; i < lista.length; ++i) {
			if (lista[i] == numero)
				++contador;
		}
		System.out.println("\nEl n?mero de veces que aparece " + numero + " en la lista es: " + contador);
	}

}
