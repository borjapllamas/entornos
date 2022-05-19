package ejercciciosEtructurasBasicas;

import java.util.Scanner;

public class XVIEstructurasBasicas {

	public XVIEstructurasBasicas() {
		// Calcular el producto de dos números enteros positivos mediante el denominado
		// "algoritmo ruso del producto": consiste en duplicar el primer factor y
		// dividir (cociente
		// entero) por 2 el segundo, obteniendo un producto equivalente, salvo si el
		// segundo es
		// impar, en cuyo caso es necesario acumular previamente el primero en donde se
		// va a
		// obtener el resultado. El proceso termina cuando el segundo factor se hace 0.
		// Por ejemplo:
		// 25 * 6
		Scanner leer = new Scanner(System.in);
		int mayor = 0, menor = 0, acu = 0;
		System.out.println("Introduzca el primer número");
		mayor = leer.nextInt();
		System.out.println("Introduzca el segundo número");
		menor = leer.nextInt();

		//if (menor % 2 != 0)acu += mayor;
			System.out.println("1 factor 2 factor Acumulador");
			System.out.println("----------------------------");
			System.out.printf("%-10d %-10d %-10d %n", mayor, menor, acu);
		do {
			if (menor % 2 != 0)
				acu += mayor;
			mayor *= 2;
			menor /= 2;

			System.out.printf("%-10d %-10d %-10d %n", mayor, menor, acu);
		} while (menor != 0);

	}

}
