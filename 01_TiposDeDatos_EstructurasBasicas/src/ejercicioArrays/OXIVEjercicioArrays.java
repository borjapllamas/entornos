package ejercicioArrays;

import java.util.Arrays;
import java.util.Scanner;

public class OXIVEjercicioArrays {

	public OXIVEjercicioArrays() {
		// 14.-Diseñar un programa en Java que compruebe si un array de enteros de 5x5, es un cuadrado mágico. Se
		// considera un cuadrado mágico aquel en el que las filas, las columnas y las diagonales suman igual.
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de filas y columnas");
        int num = sc.nextInt();
        int[][] matriz = new int[num][num];

        for (int x = 0; x < matriz.length; x++) {
            System.out.println("FILA " + x);
            for (int y = 0; y < matriz[0].length; y++) {
                matriz[x][y] = sc.nextInt();
            }
            System.out.println();
        }


        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[0].length; y++) {
                System.out.print(matriz[x][y] + "\t");
            }
            System.out.println();
        }
        int[] sumafilas = new int[num];
        int[] sumacolumnas = new int[num];
        int sumadiagonal = 0;

        int sumafila = 0;
        int sumacol = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumafila = 0;
            sumacol = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumafila += matriz[i][j];
                sumacol += matriz[j][i];
                if (i == j) {
                    sumadiagonal += matriz[i][j];
                }
            }
            sumafilas[i] = sumafila;
            sumacolumnas[i] = sumacol;

        }

        System.out.println(sumadiagonal);
        if (Arrays.equals(sumafilas, sumacolumnas) && sumafilas[0] == sumadiagonal) {
            System.out.println("Es un cuadrado mágico");
        } else {
            System.out.println("No es un cuadrado mágico");
        }
	}
}
