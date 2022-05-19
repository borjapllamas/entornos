package ejercicioArrays;

import java.util.Scanner;

public class OVIIEjercicioArrays {

	public OVIIEjercicioArrays() {
		// 7.-Escriba un programa que lea 8 números del teclado, los almacene en un
		// array y después muestre la suma y el promedio.
		Scanner leer = new Scanner(System.in);
		int suma = 0;
		double div = 0;
		int[] enteros = new int[8];
		System.out.println("Introduzca número");
		for (int x = 0; x < enteros.length; x++) {
			enteros[x] = leer.nextInt();
			suma = suma + enteros[x];
		}
		div = (double) suma / enteros.length;
		System.out.println();
		System.out.println("La suma de sus valores es : " + suma);
		System.out.println("El promedio de sus valores es : " + div);
	}

}
