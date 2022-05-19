package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XVEstructurasBasicas {

	public XVEstructurasBasicas() {
		// Dado un número entero positivo, hallar los números primos comprendidos entre 2 y dicho número.(Funciones)
		Scanner leer = new Scanner(System.in);
		String primos = "";
		System.out.println("Introduzca un numero");
		int num = leer.nextInt();
		for (int x = 2; x < num; x++) {
			boolean primo = true;
			int c = 2;
			while (x > c) {
				if (x % c == 0) {
					primo = false;
					break;
				}
				c++;
			}
			if (primo)
				primos += x + "-";
		}
		System.out.println("Los numeros primos entre 2 y " + num + " son :");
		System.out.println(primos);
	}

}
