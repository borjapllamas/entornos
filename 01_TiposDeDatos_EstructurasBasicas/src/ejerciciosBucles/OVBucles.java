package ejerciciosBucles;

import java.util.Scanner;

public class OVBucles {

	public OVBucles() {
		// Escribe un programa que calcule la media de un conjunto de n�meros positivos
		// introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se
		// introducir�n. El usuario indicar� que ha terminado de introducir los datos
		// cuando meta un n�mero negativo.
		Scanner leer = new Scanner(System.in);
		int suma, cant, valor, promedio;
		suma = 0;
		cant = 0;
		do {
			System.out.print("Ingrese un n�mero entero (negativo para finalizar):");
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