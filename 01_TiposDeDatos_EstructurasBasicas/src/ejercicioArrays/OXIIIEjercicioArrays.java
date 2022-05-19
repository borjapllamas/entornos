package ejercicioArrays;

import java.util.Scanner;

public class OXIIIEjercicioArrays {

	public OXIIIEjercicioArrays() {
		// 13.-Dado un array de NxM elementos de tipo entero (N filas y M columnas. El
		// valor de N y M se
		// pedirán por teclado) calcular la suma de sus filas y sus columnas.
		Scanner leer = new Scanner(System.in);
		int cant = 0;
		int mayor = 10;
		int menor = 1;
		System.out.println("Introduzca el número de filas");
		int filas = leer.nextInt();
		System.out.println("Introduzca número de columnas");
		int columnas = leer.nextInt();
		int[][] matriz = new int[filas][columnas];
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y] = (int) Math.floor(Math.random() * (mayor - menor + 1) + menor);
				System.out.print(matriz[x][y] + "\t");
			}
			System.out.println();
		}
		
		for (int x = 0; x < matriz.length; x++) {
			cant = 0;
			for (int y = 0; y < matriz[x].length; y++) {
				cant = cant + matriz[x][y];
			}
			System.out.println("La suma de la fila" + x + " es " + cant);
		for (int y = 0; y < matriz.length; y++) { 
			System.out.println("La suma de la columna" + y + " es " + cant);
			}	
		}
	}
}
