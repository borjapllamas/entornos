package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XXIEstructurasBasicas {

	public XXIEstructurasBasicas() {
		//Calcula el máximo común divisor de dos números mediante el algoritmo de Euclides.
		Scanner leer = new Scanner(System.in);
		int num, num2, mayor, menor, resto;
		String MCD = " ";
		System.out.println("Introduce un número entero.");
		num = leer.nextInt();
		System.out.println("Introduce otro número entero.");
		num2 = leer.nextInt();
		if (num < num2) {
			mayor = num2;
			menor = num;
			while (mayor % menor != 0) {
				resto = mayor % menor;
				mayor = resto;
				menor = resto;
			}

		}
		while (num % num2 != 0) {
			resto = num % num2;
			num = num2;
			num2 = resto;
		}
		MCD += num2;

		System.out.println("El MCD es:" + MCD);
	}

}
