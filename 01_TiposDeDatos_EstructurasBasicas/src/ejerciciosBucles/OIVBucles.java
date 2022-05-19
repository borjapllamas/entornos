package ejerciciosBucles;

import java.util.Scanner;

public class OIVBucles {

	public OIVBucles() {
		Scanner leer = new Scanner(System.in);
		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		// por teclado. Este ejercicio es equivalente a otro realizado anteriormente,
		// con la salvedad de que el anterior estaba limitado a números de 5 dígitos
		// como máximo. En esta ocasión hay que realizar el ejercicio utilizando bucles;
		// de esta manera, la única ocasión en el número de dígitos la establece el tipo
		// de dato que se utilice (int o long).
		int numeroDigitos = 1;
		int numero;
		int numeroIntroducido;
		System.out.println("Introduzca un número entero y le diré cuántos dígitos tiene: ");
		numeroIntroducido = leer.nextInt();
		numero = numeroIntroducido;
		while (numero > 10) {
			numero /= 10;
			numeroDigitos++;
		}
		System.out.println(numeroIntroducido + " tiene " + numeroDigitos + " dígito/s. ");
	}

}
