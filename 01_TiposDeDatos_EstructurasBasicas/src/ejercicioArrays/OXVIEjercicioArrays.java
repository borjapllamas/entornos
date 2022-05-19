package ejercicioArrays;

import java.util.Scanner;

public class OXVIEjercicioArrays {

	public OXVIEjercicioArrays() {
		// 16.-Dado un array de enteros de tamaño 5x5, diseñar un programa en Java que
		// lo rellene como en la siguiente figura:
		// 0 1 2 3 4
		// 1 2 3 4 3
		// 2 3 4 3 2
		// 3 4 3 2 1
		// 4 3 2 1 0

		System.out.println("Introduce número de filas y columnas");
		Scanner leer = new Scanner(System.in);
		int num = leer.nextInt();
		int[][] matriz = new int[num][num];
		int cont = 0;
		boolean suma = true;
		for (int x = 0; x < matriz.length; x++) {
			cont = x;
			suma = true;
			for (int y = 0; y < matriz[0].length; y++) {
				matriz[x][y] = cont;
				if (cont == matriz.length - 1) {
					suma = false;
				}
				if (suma) {
					cont++;
				} else {
					cont--;
				}
			}
		}

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[0].length; y++) {
				System.out.print(matriz[x][y] + "\t");
			}
			System.out.println();
		}

	}

}
