package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class VIIEstructurasBasicas {

	public VIIEstructurasBasicas() {
		//Introducir 20 n�meros enteros por teclado. Indicar cu�nto suman (en valor absoluto) los
		//negativos, y cu�nto los positivos.
		Scanner leer = new Scanner(System.in);
		int numeroIntento = 0;
		int contador=1;
		String numeros = " ";
		System.out.println("Introduce 20 n�meros enteros por teclado, le quedan " + (20 - numeroIntento) + " n�meros por introducir");
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
