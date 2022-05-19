package ejerciciosClases;

import java.util.Scanner;

public class EjercicioArrays {

	public EjercicioArrays() {
		Scanner leer = new Scanner(System.in);
		double[] clase1 = new double[7];
		double[] clase2 = new double[5];
		double[] clase3 = new double[4];
		double suma = 0;
		for (int i = 0; i < clase1.length; i++) {
			System.out.println("Introduce el valor de la posición " + i);
			clase1[i] = leer.nextDouble();
		}
		for (int i = 0; i < clase2.length; i++) {
			System.out.println("Introduce el valor de la posición " + i);
			clase2[i] = leer.nextDouble();
		}
		for (int i = 0; i < clase3.length; i++) {
			System.out.println("Introduce el valor de la posición " + i);
			clase3[i] = leer.nextDouble();
		}
		for (int i = 0; i < clase1.length; i++) {
			suma = suma + clase1[i];
		}
		for (int i = 0; i < clase2.length; i++) {
			suma = suma + clase2[i];
		}
		for (int i = 0; i < clase3.length; i++) {
			suma = suma + clase3[i];
		}
		System.out.println(suma);
		System.out.println(sumaArray(clase1));
		System.out.println(sumaArray(clase2));
		System.out.println(sumaArray(clase3));
	}

	public double sumaArray(double[] array) {
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = array[i] + suma;
		}
		return suma;
	}
}
