package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class VIIEstructurasBasicas {

	public VIIEstructurasBasicas() {
		//Introducir 20 números enteros por teclado. Indicar cuánto suman (en valor absoluto) los
		//negativos, y cuánto los positivos.
		Scanner leer = new Scanner(System.in);
		int numeroIntento = 0;
		int contador=1;
		String numeros = " ";
		System.out.println("Introduce 20 números enteros por teclado, le quedan " + (20 - numeroIntento) + " números por introducir");
		int num = leer.nextInt();
		for (int i = 1; (i>0) && (contador <=20); i++) {
			if (i%2 == 0) {
				contador++;
			}System.out.println("Los numeros positivos son los siguientes : " +numeros);
			if (i%2 != 0) {
				contador++;
			}System.out.println("Los numeros negativos son los siguientes : " +numeros);
		}
	}

}
