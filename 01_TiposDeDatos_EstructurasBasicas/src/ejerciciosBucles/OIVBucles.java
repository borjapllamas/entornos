package ejerciciosBucles;

import java.util.Scanner;

public class OIVBucles {

	public OIVBucles() {
		Scanner leer = new Scanner(System.in);
		// Realiza un programa que nos diga cu?ntos d?gitos tiene un n?mero introducido
		// por teclado. Este ejercicio es equivalente a otro realizado anteriormente,
		// con la salvedad de que el anterior estaba limitado a n?meros de 5 d?gitos
		// como m?ximo. En esta ocasi?n hay que realizar el ejercicio utilizando bucles;
		// de esta manera, la ?nica ocasi?n en el n?mero de d?gitos la establece el tipo
		// de dato que se utilice (int o long).
		int numeroDigitos = 1;
		int numero;
		int numeroIntroducido;
		System.out.println("Introduzca un n?mero entero y le dir? cu?ntos d?gitos tiene: ");
		numeroIntroducido = leer.nextInt();
		numero = numeroIntroducido;
		while (numero > 10) {
			numero /= 10;
			numeroDigitos++;
		}
		System.out.println(numeroIntroducido + " tiene " + numeroDigitos + " d?gito/s. ");
	}

}
