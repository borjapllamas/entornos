package ejercicioArrays;

import java.util.Scanner;

public class OVIIIEjercicioArrays {

	public OVIIIEjercicioArrays() {
		// 8.- Escriba un programa que permita registrar 6 numeros en forma de tabla 3x2.
		// A continuación el programa mostrará los valores máximo y mínimo de cada fila y de toda la tabla.
		Scanner leer = new Scanner(System.in);
		int enteros[] = new int[6];
		System.out.println("Introduzca 3 números para las filas");
		int filas = leer.nextInt();
		System.out.println("Introduzca 2 número para las columnas");
		int columnas = leer.nextInt();
		String[][]matriz = new String[filas][columnas];
		for (int x = 0; x < matriz.length; x++) {
			for ( int y = 0; y < matriz[x].length; y++) {
				
			}
			
		}
		
	}

}
