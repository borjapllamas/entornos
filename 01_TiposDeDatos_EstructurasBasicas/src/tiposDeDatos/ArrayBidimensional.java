package tiposDeDatos;

import java.util.Scanner;

public class ArrayBidimensional {

	public ArrayBidimensional() {
		System.out.println("Estudio Arrays Bidimensionales");
		int[][] notas;
		int[] numeros = { 1, 2, 3, 4, 5, 6 };
		notas = new int[5][20];
		int[][] notas2 = new int[6][30];
		notas2[0][0] = 1;
		int[][] notas3 = new int[4][];
		notas3[0] = new int[10];
		notas3[1] = new int[12];
		notas3[2] = new int[15];
		notas3[3] = numeros;
		int[][] notas4 = { { 5, 6, 7, 8, 9, 4 }// 1sup
				, { 5, 6, 8, 1, 7, 9 }, { 5, 5, 4, 6, 8, 7 }, { 2, 3, 5, 6, 8, 7 } };
		// leer array de principio a fin
		for (int x = 0; x < notas4.length; x++) {
			for (int y = 0; y < notas4[x].length; y++) {
				System.out.print(notas4[x][y] + "-");
			}
			
		}

		for (int x = 0; x < notas4.length; x++) {
			for (int y = 0; y < notas4[x].length; y++) {
				notas4[x][y] = (int) (Math.random() * 10);
				System.out.print(notas4[x][y] + "-");
			}
			
		}

		imprimirArray(notas4);

		System.out.println("======================================================");

		imprimirArray(notas4);
		String nombres[] = { "Maria", "Pepe", "Antonia", "Carlos", "Vicenta", "Sergio" };
		String[] asignaturas = { "Programacion", "Sistemas", "Base de datos", "Lenguaje de marcas" };
		// Quiero mostrar una asignatura
		System.out.println("Introduzca la asignatura (1.-Prog2.-Sistemas 3.-BBD 4.-LM");
		Scanner leer = new Scanner(System.in);
		int num = leer.nextInt();
		num--;
		System.out.println(asignaturas[num]);
		System.out.println("==============================");
		for (int y = 0; y < notas.length; y++) {
			System.out.println(nombres[y] + "         " + notas4[num][y]);

			System.out.println("Introduzca el número del alumno :");
			num = leer.nextInt();
			num--;
			System.out.println(nombres[num]);
			System.out.println("=============");
			for (int x = 0; x < notas4.length; x++) {

				System.out.println(asignaturas[x] + "     " + notas4[x][num]);
			}
		}
	}

	private void imprimirArray(int[][] notas) {
		// TODO Esbozo de método generado automáticamente
		// notas[0][0]=0;
		for (int x = 0; x < notas.length; x++) {
			for (int y = 0; y < notas[x].length; y++) {
				System.out.print(notas[x][y] + "-");
			}
			System.out.println();
		}
	}
}
