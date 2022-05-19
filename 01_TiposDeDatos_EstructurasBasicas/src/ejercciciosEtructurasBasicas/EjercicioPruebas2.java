package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class EjercicioPruebas2 {

	public EjercicioPruebas2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántas columnas quiere?");
		int num = sc.nextInt();
		int[][] primitiva = new int[num][num];
		int randomNum = 0;
		for (int x = 0; x < primitiva.length; x++) {
			for (int y = 0; y < primitiva[0].length; y++) {
				do {
					randomNum = (int) (Math.random() * 49 + 1);
				} while (repetido(randomNum, primitiva[x]));
				primitiva[x][y] = randomNum;
			}
		}
		for (int x = 0; x < primitiva.length; x++) {
			for (int y = 0; y < primitiva[0].length; y++) {
				System.out.print(primitiva[x][y] + "\t");
			}
			System.out.println();
		}
	}

	public boolean repetido(int num, int[] fila) {
		for (int y = 0; y < fila.length; y++) {
			if (fila[y] == num) {
				return true;
			}
		}
		return false;
	}

}