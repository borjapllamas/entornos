package ejerciciosBucles;

import java.util.Scanner;

public class OVBucles {

	public OVBucles() {
		// Escribe un programa que calcule la media de un conjunto de números positivos
		// introducidos por teclado. A priori, el programa no sabe cuántos números se
		// introducirán. El usuario indicará que ha terminado de introducir los datos
		// cuando meta un número negativo.
		Scanner leer = new Scanner(System.in);
		int suma, cant, valor, promedio;
		suma = 0;
		cant = 0;
		do {
			System.out.print("Ingrese un número entero (negativo para finalizar):");
			valor = leer.nextInt();
			if (valor >= 0) {
				suma = suma + valor;
				cant++;
			}
		} while (valor >= 0);
		if (cant >= 0) {
			promedio = suma / cant;
			System.out.print("El promedio de los valores ingresados es: " + promedio);
		} else {
			System.out.print("No se ingresaron valores.");
		}
	}
}