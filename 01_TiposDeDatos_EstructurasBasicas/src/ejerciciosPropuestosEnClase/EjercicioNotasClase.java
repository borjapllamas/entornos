package ejerciciosPropuestosEnClase;

import java.util.Scanner;

public class EjercicioNotasClase {

	public EjercicioNotasClase() {
		// Se tiene una tabla con las calificaciones obtenidas por un grupo de N
		// estudiantes en 5 exámenes diferentes.
		// Realice un programa en Java, que permita calcular lo siguiente:
		// a.El promedio de calificaciones de cada uno de los N estudiantes
		// (considerando los 5 exámenes).
		// b.El estudiante o los estudiantes que obtuvieron la mejor calificación en el
		// tercer examen.
		// c.El o los estudiantes, si existieran, que obtuvieron la mayor calificación
		// en el primero y en el quinto examen.
		// d.¿En cuál examen fue más alto el promedio de los N estudiantes?
		int[][] notas = { { 5, 8, 9, 6, 6, 7, 3, 4, 5, 10 }, { 3, 2, 4, 5, 6, 7, 8, 4, 6, 7 },
				{ 4, 5, 5, 3, 7, 6, 6, 8, 5, 9 }, { 3, 5, 5, 4, 6, 6, 7, 5, 6, 7 } };
		String[] asignaturas = { "Matemáticas", "Lengua     ", "Inglés      ", "Geografía" };
		String[] alumnos = { "María", "Pepe", "Paco", "Lucía", "Juan", "Lucas", "David", "Pepa", "Juana", "Miguel" };

		notaMedia(alumnos, notas);
		mejorNotaTercerExamen(alumnos, notas);
		mejorNotaPrimerQuintoExamen(alumnos, notas);
		examenConMejorMedia(alumnos, notas);
	}

	private void mejorNotaTercerExamen(String[] alumnos, int[][] notas) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Alumnos con mejor calificación en el tercer examen");
		System.out.println("==================================================");
		int ex = 2;
		int nota = notaMasAlta(notas, ex);
		for (int y = 0; y < notas[2].length; y++) {
			if (notas[2][y] == nota)
				System.out.printf("%-10s : %2d %n", alumnos[y], notas[2][y]);
		}
	}

	private void mejorNotaTercerExamen(String[] alumnos, int[][] notas) {
		// TODO Auto-generated method stub
		System.out.println();
		int nota1 = 0, nota5 = 0;
		nota1 = notaMasAlta(notas, 0);
		nota5 = notaMasAlta(notas, 4);
		System.out.println("Nota mas alta ex1 :" + nota1 + " nota ex5 :" + nota5);
		System.out.println("==================================================");
		System.out.println();
		for (int y = 0; y < notas[2].length; y++) {
			System.out.printf("%-10s : %2d  %2d %n", alumnos[y], notas[0][y], notas[4][y]);
		}
	}

	private void examenConMejorMedia(String[] alumnos, int[][] notas) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Examen con mejor media");
		System.out.println("============================");
		int ex = 0;
		double mediaMasAlta = 0, media = 0;
		for (int x = 0; x < notas.length; x++) {
			media = 0;
			for (int y = 0; y < notas[x].length; y++) {
				media += notas[x][y];
			}
			media /= 10;
			System.out.println("Media Examen" + (x + 1) + " :" + media);
			if (media > mediaMasAlta) {
				mediaMasAlta = media;
				ex = x;
			}
		}
		System.out.println("La media más alta está en el examen" + (ex + 1) + " con :" + mediaMasAlta);
	}

	private int notaMasAlta(int[][] notas, int ex) {
		int nota = 0;
		for (int y = 0; y < notas[ex].length; y++) {
			if (notas[ex][y] > nota)
				nota = notas[ex][y];
		}
		return nota;
	}

	private void notaMedia(String[] alumnos, int[][] notas) {
		// TODO Auto-generated method stub
		double media = 0;
		System.out.println("NOTA MEDIA DEL CURSO");
		System.out.println("========================");
		for (int y = 0; y < notas[0].length; y++) {
			media = 0;
			for (int x = 0; x < notas.length; x++) {
				media += notas[x][y];
			}
			System.out.printf("%-10s :%.2f %n", alumnos[y], (media));
		}
	}

	private void mejorNotaPrimerQuintoExamen(String[] alumnos, int[][] notas) {
		// TODO Auto-generated method stub
		System.out.println();
		int nota1 = 0, nota5 = 0;
		nota1 = notaMasAlta(notas, 0);
		nota5 = notaMasAlta(notas, 4);
		System.out.println("Nota mas alta ex1 :" + nota1 + " nota ex5 :" + nota5);
		System.out.println("=============================================");
		System.out.println();
		for (int y = 0; y < notas[0].length; y++) {
			if (notas[0][y] == nota1 && notas[4][y] == nota5)
				System.out.printf("%-10s : %2d  %2d %n", alumnos[y], notas[0][y], notas[4][y]);
		}
	}

}
